package com.jachs.mybatis.multiple.d3;

import javax.sql.DataSource;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * 
 * @author zhanchaohan
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Configuration
@PropertySource("classpath:d3.properties")
@ConfigurationProperties(prefix="spring.datasource.druid.mysql")

@MapperScan(basePackages = {"com.jachs.mybatis.multiple.d3.mapper"}, sqlSessionFactoryRef = "d3SessionFactory", annotationClass = Mapper.class)
public class DruidConfig {
	
	private String driverClassName;
	private String url;
	private String username;
	private String password;
	
	@Bean(name = "d3DataSource")
    public DataSource createDataSource(){
		DruidDataSource dataSource = new DruidDataSource();
		
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
    }
	
	@Bean(name = "d3SessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("d3DataSource") DataSource dataSource) throws Exception {
		MybatisSqlSessionFactoryBean bean=new MybatisSqlSessionFactoryBean(); 
        bean.setDataSource(dataSource);
        Resource[]  resource= new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/d3/*.xml");
        bean.setMapperLocations(resource);
        return bean.getObject();
    }

    @Bean(name = "d3TransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("d3DataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "d3SqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("d3SessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
