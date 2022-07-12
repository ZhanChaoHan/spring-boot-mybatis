package com.jachs.mybatis.dynamic;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

/***
 * 测试数据源是否正常
 * @author zhanchaohan
 *
 */
@SpringBootTest
public class SourcesTest {
	@Autowired
	@Qualifier("d1DataSource")
	private DataSource dataSource1;
	
	@Autowired
	@Qualifier("d2DataSource")
	private DataSource dataSource2;
	
	@Autowired
	@Qualifier("d3DataSource")
	private DataSource dataSource3;
	
	
	@Test
	public void test1() throws SQLException {
		ResultSet resultSet=dataSource1.getConnection().createStatement().executeQuery("select computerName from computer where computerName='d1'");
		
		while(resultSet.next()) {
			System.out.println(resultSet.getString("computerName"));
		}
	}
	@Test
	public void test2() throws SQLException {
		ResultSet resultSet=dataSource2.getConnection().createStatement().executeQuery("select computerName from computer where computerName='d2'");
		
		while(resultSet.next()) {
			System.out.println(resultSet.getString("computerName"));
		}
	}
	@Test
	public void test3() throws SQLException {
		ResultSet resultSet=dataSource3.getConnection().createStatement().executeQuery("select computerName from computer where computerName='d3'");
		
		while(resultSet.next()) {
			System.out.println(resultSet.getString("computerName"));
		}
	}
	
}
