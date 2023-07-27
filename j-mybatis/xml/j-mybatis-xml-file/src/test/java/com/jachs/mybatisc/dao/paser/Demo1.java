package com.jachs.mybatisc.dao.paser;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.mapping.ParameterMode;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.property.PropertyTokenizer;
import org.apache.ibatis.scripting.xmltags.ForEachSqlNode;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jachs.mybatis.Application;
import com.jachs.mybatis.entity.Computer;

/**
 * @author zhanchaohan
 * 
 */
@SpringBootTest(classes = Application.class)
public class Demo1 {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    
    @Test
    public void t1() {
        String sql=sqlSessionFactory.getConfiguration ().getMappedStatement ( "com.jachs.mybatis.dao.ComputerMapper.insertSelective" ).getBoundSql ( null ).getSql ();
        
        System.out.println ( sql );
    }
    
    @Test
    public void t3() {
        Computer cp=new Computer ();
        cp.setComputerid ( "YWC" );
//        cp.setComputername ( "GHJKLCI" );
//        cp.setComputerprice ( 12L );
        cp.setMadetime ( new Date () );
        
        String sql=sqlSessionFactory.getConfiguration ().getMappedStatement ( "com.jachs.mybatis.dao.ComputerMapper.insertSelective" ).getBoundSql ( cp ).getSql ();
        System.out.println ( sql );
    }
    
    @Test
    public void t2() {
        Computer cp=new Computer ();
        cp.setComputerid ( "YWC" );
//        cp.setComputername ( "GHJKLCI" );
//        cp.setComputerprice ( 12L );
        cp.setMadetime ( new Date () );
        String sql = getMyBatisSql("com.jachs.mybatis.dao.ComputerMapper.insertSelective", cp, sqlSessionFactory);
        
        System.out.println(sql);
    }
    
    public static String getMyBatisSql(String id, Object obj, SqlSessionFactory sqlSessionFactory) {
        SimpleDateFormat sdf=new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
        MappedStatement ms = sqlSessionFactory.getConfiguration().getMappedStatement(id);
        BoundSql boundSql = ms.getBoundSql(obj);
        String sql = boundSql.getSql();
        List<ParameterMapping> parameterMappings = boundSql.getParameterMappings();
        if (parameterMappings != null) {
            Object[] parameterArray = new Object[parameterMappings.size()];
            ParameterMapping parameterMapping = null;
            Object value = null;
            Object parameterObject = null;
            MetaObject metaObject = null;
            PropertyTokenizer prop = null;
            String propertyName = null;
            String[] names = null;
            for (int i = 0; i < parameterMappings.size(); i++) {
                parameterMapping = parameterMappings.get(i);
                if (parameterMapping.getMode() != ParameterMode.OUT) {
                    propertyName = parameterMapping.getProperty();
                    names = propertyName.split("\\.");
                    if (propertyName.indexOf(".") != -1 && names.length == 2) {
                        parameterObject = boundSql.getAdditionalParameter(names[0]);
                        propertyName = names[1];
                    } else if (propertyName.indexOf(".") != -1 && names.length == 3) {
                        parameterObject = boundSql.getAdditionalParameter(names[0]); // map
                        if (parameterObject instanceof Map) {
                            parameterObject = ((Map) parameterObject).get(names[1]);
                        }
                        propertyName = names[2];
                    } else {
                        parameterObject = boundSql.getAdditionalParameter(propertyName);
                    }
                    if (null == parameterObject) {
                        parameterObject = getFieldValueByFieldName(propertyName, obj);
                    }
                    prop = new PropertyTokenizer(propertyName);
                    if (parameterObject == null) {
                        value = null;
                    } else if (ms.getConfiguration().getTypeHandlerRegistry().hasTypeHandler(parameterObject.getClass())) {
                        value = parameterObject;
                        if(parameterMapping.getJavaType ()==Date.class) {//时间类型格式化时间戳
                            value = sdf.format ( value );
                        }
                    } else if (boundSql.hasAdditionalParameter(propertyName)) {
                        value = boundSql.getAdditionalParameter(propertyName);
                    } else if (propertyName.startsWith(ForEachSqlNode.ITEM_PREFIX) && boundSql.hasAdditionalParameter(prop.getName())) {
                        value = boundSql.getAdditionalParameter(prop.getName());
                    } else {
                        value = metaObject == null ? null : metaObject.getValue(propertyName);
                    }
                    parameterArray[i] = value;
                }
                parameterObject = null;
            }
            int i = 0;
            while (sql.indexOf("?") != -1) {
                if (null == parameterArray[i]) {
                    throw new RuntimeException("mybatis获取sql异常");
                }
                if (parameterArray[i] instanceof String) {
                    sql = sql.replaceFirst("\\?", "'" + parameterArray[i].toString() + "'");
                } else {
                    sql = sql.replaceFirst("\\?", parameterArray[i].toString());
                }
                i++;
            }
            int index;
            StringBuilder sb = new StringBuilder();
            for (String s : sql.split("\n")) {
                index = s.indexOf("--");
                if (-1 == index) {
                    index = s.length();
                }
                sb.append(s.substring(0, index).replace("\t", " ").trim()).append(" ");
            }
            return sb.toString().replaceAll("(\r?\n(\\s*\r?\n)+)", " ").replaceAll("\n", " ").replaceAll("\r", " ").replaceAll("    ", " ").replaceAll("   ", " ").replaceAll("  ", " ");

        }
        return sql;
    }
    
    /**
     * 根据属性名获取属性值
     *
     * @param fieldName
     * @param object
     * @return
     */
    public static Object getFieldValueByFieldName(String fieldName, Object object) {
        try {
            Field field = object.getClass().getDeclaredField(fieldName);
            //设置对象的访问权限，保证对private的属性的访问
            field.setAccessible(true);
            return  field.get(object);
        } catch (Exception e) {
            new RuntimeException(e);
            return null;
        }
    }
    
}
