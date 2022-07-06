package com.jachs.mybatis.multiple.d2;

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
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/***
 * 
 * @author zhanchaohan
 *
 */
@Configuration
@PropertySource("classpath:d2.properties")

@MapperScan(basePackages = {"com.jachs.mybatis.multiple.d2.mapper"}, sqlSessionFactoryRef = "d2SessionFactory", annotationClass = Mapper.class)
public class C3p0Config {
	
	@Bean(name = "d2DataSource")
	@ConfigurationProperties(prefix = "spring.datasource.c3p0")
    public DataSource createDataSource(){
        return DataSourceBuilder.create() 
                .type(ComboPooledDataSource.class) // 设置数据源类型
                .build(); 
    }
	
	@Bean(name = "d2SessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("d2DataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean.getObject();
    }

    @Bean(name = "d2TransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("d2DataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "d2SqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("d2SessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
