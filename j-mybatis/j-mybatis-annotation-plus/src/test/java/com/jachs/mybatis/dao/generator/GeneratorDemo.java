package com.jachs.mybatis.dao.generator;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.IColumnType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/***
 * 
 * @author zhanchaohan
 *
 */
public class GeneratorDemo {
//	static String projectPath = System.getProperty("user.dir");//当前项目路径
	static String projectPath = "D:\\c";
	static List<TableFill> tableFillList = new ArrayList<TableFill>();// 自定义需要填充的字段
	static String packageName="com.jachs.knife4j";//包名
    static String []tableName=new String[] {
            "sys_user","sys_group"};//表名
	
	private static GlobalConfig globalConfig() {
        GlobalConfig config = new GlobalConfig();//全局配置
        // 是否支持AR模式
        config.setActiveRecord(true)
                .setAuthor("zhanchaohan")// 作者
                .setOutputDir(projectPath + "/src/main/java/")// 生成路径
                .setFileOverride(true)// 文件覆盖
                .setIdType(IdType.AUTO)// 主键策略
                .setServiceName("%sService")// 设置生成的service接口的名字的首字母是否为I,例如IEmployeeService
                .setBaseResultMap(true)//生成基本的resultMap
                .setBaseColumnList(true)//生成基本的SQL片段
                .setOpen(false).setDateType(DateType.ONLY_DATE);//生成后打开文件夹
        
        return config;
	}
	private static DataSourceConfig dataSourceConfig() {
		DataSourceConfig dsConfig = new DataSourceConfig();
        // 设置数据库类型
        dsConfig.setDbType(DbType.MYSQL)
                .setDriverName("com.mysql.cj.jdbc.Driver")
                .setUrl("jdbc:mysql://localhost:3306/test")
                .setUsername("root")
                .setPassword("123456")
                .setTypeConvert(new MySqlTypeConvert() {
                    // 自定义数据库表字段类型转换【可选】
                    @Override
                    public IColumnType processTypeConvert(GlobalConfig globalConfig, String fieldType) {
                        System.out.println("转换类型：" + fieldType);
                        if (fieldType.toLowerCase().contains("tinyint")) {
                            return DbColumnType.INTEGER;
                        }
                        return super.processTypeConvert(globalConfig, fieldType);
                    }
                });
        return dsConfig;
	}
	private static StrategyConfig strategyConfig() {
		//策略配置globalConfiguration中
        StrategyConfig stConfig = new StrategyConfig();
        // 全局大写命名
        stConfig.setCapitalMode(true)
                // 指定表名 字段名是否使用下划线
                //.setDbColumnUnderline(true)
                // 数据库表映射到实体的命名策略
                .setNaming(NamingStrategy.underline_to_camel)
                //.setTablePrefix("tbl_")
                // 生成的表
                .setInclude(tableName)
                .setEntityBooleanColumnRemoveIsPrefix(false)
                // 自定义实体，公共字段
                .setTableFillList(tableFillList);
        
        return stConfig;
	}
	private static  PackageConfig packageConfig() {
		 PackageConfig pkConfig = new PackageConfig();
	        pkConfig.setParent(packageName)
	                .setMapper("mapper")//dao
	                .setService("service")//servcie
	                .setController("web")//controller
	                .setEntity("domain")//entity
	                .setXml("xml");//mapper.xml
	        
	        return pkConfig;
	}
	public static void main(String[] args) {
        //如 每张表都有一个创建时间、修改时间
        //而且这基本上就是通用的了，新增时，创建时间和修改时间同时修改
        //修改时，修改时间会修改，
        //虽然像Mysql数据库有自动更新几只，但像ORACLE的数据库就没有了，
        //使用公共字段填充功能，就可以实现，自动按场景更新了。
        //如下是配置
        TableFill sysCreateTime = new TableFill("create_time", FieldFill.INSERT);
        TableFill sysUpdateTime = new TableFill("update_time", FieldFill.UPDATE);
        TableFill sysCreateBy = new TableFill("create_by", FieldFill.INSERT);
        TableFill sysUpdateBy = new TableFill("update_by", FieldFill.UPDATE);
        tableFillList.add(sysCreateTime);
        tableFillList.add(sysUpdateTime);
        tableFillList.add(sysCreateBy);
        tableFillList.add(sysUpdateBy);


        // 注入自定义配置，可以在 VM 中使用 cfg.abc 【可无】
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<>();
                map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
                this.setMap(map);
            }
        };

        // 自定义输出文件目录
        List<FileOutConfig> focList = new ArrayList<>();
        // 调整xml生成目录演示
        focList.add(new FileOutConfig("/templates/mapper.xml.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return projectPath + "/src/main/resources/META-INF/mybatis/" + tableInfo.getEntityName() + "Mapper.xml";
            }
        });
        cfg.setFileOutConfigList(focList);

        // 关闭默认生成，如果设置空 OR Null 将不生成该模块。
        TemplateConfig tc = new TemplateConfig();
        tc.setController(null);//不生成Controller文件
        tc.setXml(null);//不生成xml文件

        AutoGenerator ag = new AutoGenerator();
        ag.setGlobalConfig(globalConfig())
                .setDataSource(dataSourceConfig())
                .setStrategy(strategyConfig())
                .setPackageInfo(packageConfig())
                .setCfg(cfg)
                .setTemplate(tc);

        ag.execute();
    }

}
