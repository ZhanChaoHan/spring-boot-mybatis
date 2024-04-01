package com.jachs.xml;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.jachs.xml.entity.Software;
import com.jachs.xml.mapper.SoftwareMapper;

/***
 * 
 * @author zhanchaohan
 *
 */
public class Annotation {
    SqlSession sqlSession;
    
    @Before
    public void init() {
        InputStream is=App.class.getResourceAsStream ( "configer/mybatis-config.xml" );
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory1 = sqlSessionFactoryBuilder.build(is, "development");
        sqlSession = sqlSessionFactory1.openSession(true);
    }
    
    @Test
    public void t1() {
        SoftwareMapper mapper=sqlSession.getMapper ( SoftwareMapper.class );
        
        Software sw= mapper.selectBlog ( "QMT" );
        
        System.out.println ( sw.toString () );
    }
}
