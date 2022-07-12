package com.jachs.mybatis.dao.generator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig.Builder;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;

/***
 * 3.5.3版
 * @author zhanchaohan
 * @see https://github.com/baomidou/generator
 */
public class GeneratorDemo1 {
	private static final String url="jdbc:mysql://localhost:3306/jpatest";
	private static final String username="root";
	private static final String password="123456";
	private static final String author="zhanchaohan";
	
	
	private static final String projectPath="D:\\c";//存放路径
	private static final String xmlPath="D:\\c\\a";//xml文件存放路径
	private static final String parent="com.jachs.mybatis.dynamic";//项目包路径
	private static final String moduleName="test";//模块名称
	private static final String []tSt=new String[] {"computer","software","exam","player","videogame"};
	
	private static List<String> initTable() {
		List<String>table=new ArrayList<String>();
		
		for (String st : tSt) {
			table.add(st);
		}
		return table;
	}
	public static DataSourceConfig dcBuilder() throws InstantiationException, IllegalAccessException {
		Builder builder=new DataSourceConfig.Builder(url, username, password);
		
		return builder.build();
	}
	public static StrategyConfig strategyConfig() {
		StrategyConfig sc=new StrategyConfig.Builder()
				.addInclude(initTable())
				.entityBuilder()//配置实体
				.enableTableFieldAnnotation()//加上实体注解
				
				.formatFileName("%sEntity")//添加后缀
                .enableLombok()//添加lombock的getter、setter注解
                .mapperBuilder()//配置mapper类添加@Mapper
				.build();
		
		return  sc;
	}
	public static void main(String[] args) {
		try {
		 AutoGenerator generator = new AutoGenerator(dcBuilder());
	     
	     generator.global(globalConfig());
	     generator.packageInfo(packageConfig());
	     generator.strategy(strategyConfig());
	     
	     generator.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static PackageConfig  packageConfig() {
		 PackageConfig pkgConfig = new PackageConfig.Builder()
	                .parent(parent)
//	                .moduleName(moduleName)
	                .entity("entity")
	                .service("service")
	                .serviceImpl("service.impl")
	                .mapper("mapper")
	                .xml("mapper.xml")
	                .controller("controller")
	                .pathInfo(Collections.singletonMap(OutputFile.xml, xmlPath))
	                .build();
		 return pkgConfig;
	}
	public static GlobalConfig  globalConfig() {
		com.baomidou.mybatisplus.generator.config.GlobalConfig.Builder gc=new GlobalConfig.Builder()
                .disableOpenDir() // 禁止打开输出目录	默认值:true
                .author(author) //作者名
                .outputDir(projectPath+"/src/main/") // 指定输出目录
                .enableSwagger();
		
		return gc.build();
	}
}
