package com.jachs.mybatis.multiple.d1;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * 
 * @author zhanchaohan
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

@Configuration
@PropertySource("classpath:d1.properties")
@ConfigurationProperties(prefix="spring.datasource.dbcp2")

@MapperScan(basePackages = {"com.jachs.mybatis.multiple.d1.mapper"},
sqlSessionFactoryRef = "d1SessionFactory",sqlSessionTemplateRef ="d1SqlSessionTemplate",
annotationClass = Mapper.class)
public class Dbcp2Config {
	private String driver;
	private String url;
	private String user;
	private String password;
	private int initialSize;
	private int maxTotal;
	private int maxIdle;
	private int minIdle;
	private Long maxWaitMillis;
	private Boolean defaultAutoCommit;
	
	@Primary
	@Bean(name = "d1DataSource")
	public DataSource dbcpSource() {
		BasicDataSource source=new BasicDataSource();
		
		source.setDriverClassName(driver);
		source.setUrl(url);;
		source.setUsername(user);
		source.setPassword(password);
		source.setInitialSize(initialSize);
		source.setMaxTotal(maxTotal);
		source.setMaxIdle(maxIdle);
		source.setMinIdle(minIdle);
		source.setMaxWaitMillis(maxWaitMillis);
		
		source.setDefaultAutoCommit(defaultAutoCommit);
		return source;
	}
	/***
	 * mybatis配置用SqlSessionFactoryBean,plus用MybatisSqlSessionFactoryBean对象
	 */
	@Primary
	@Bean(name = "d1SessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("d1DataSource") DataSource dataSource) throws Exception {
		MybatisSqlSessionFactoryBean bean=new MybatisSqlSessionFactoryBean(); 
        bean.setDataSource(dataSource);
        Resource[]  resource= new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/d1/*.xml");
        bean.setMapperLocations(resource);
//        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("com/jachs/mybatis/multiple/d1/mapper/mapper/*.xml"));
        return bean.getObject();
    }
	
	@Primary
    @Bean(name = "d1TransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("d1DataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
	
	@Primary
    @Bean(name = "d1SqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("d1SessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
