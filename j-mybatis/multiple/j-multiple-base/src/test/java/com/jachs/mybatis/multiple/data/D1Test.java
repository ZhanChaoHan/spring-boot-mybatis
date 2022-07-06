package com.jachs.mybatis.multiple.data;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import com.jachs.mybatis.multiple.d1.mapper.ComputerMapper;

/**
 * 
 * @author zhanchaohan
 *
 */
@SpringBootTest

//@ComponentScan(
//		basePackages = "com.jachs.mybatis.multiple.*",
//		excludeFilters = {
//				@ComponentScan.Filter(type = FilterType.REGEX, pattern = "com.jachs.mybatis.multiple.d2\\..*"),
//				@ComponentScan.Filter(type = FilterType.REGEX, pattern = "com.jachs.mybatis.multiple.d3\\..*")
//				})
@ComponentScan("com.jachs.mybatis.multiple.*")
//@ComponentScan("com.jachs.mybatis.multiple.*")
//@MapperScan("com.jachs.mybatis.multiple.*")
public class D1Test {
	@Autowired
	private ComputerMapper computerMapper;
	
	@Test
	public void test1() {
		computerMapper.selectList(null).forEach(cp->{
			System.out.println(cp.toString());
		});;
		
	}
}
