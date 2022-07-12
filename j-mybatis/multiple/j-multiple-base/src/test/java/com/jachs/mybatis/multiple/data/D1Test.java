package com.jachs.mybatis.multiple.data;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import com.jachs.mybatis.multiple.d1.mapper.ComputerMapper;
import com.jachs.mybatis.multiple.d2.mapper.StudentcardMapper;
import com.jachs.mybatis.multiple.d3.mapper.PlayerMapper;

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
//@MapperScan("com.jachs.mybatis.multiple.*")
public class D1Test {
	@Autowired
	private ComputerMapper computerMapper;
	@Autowired
	private StudentcardMapper studentcardMapper;
	@Autowired
	private PlayerMapper playerMapper;
	
	
	@Test
	public void test1() {
		computerMapper.selectList(null).forEach(cp->{
			System.out.println(cp.toString());
		});
	}
	
	@Test
	public void test2() {
		studentcardMapper.selectList(null).forEach(sm->{
			System.out.println(sm.toString());
		});
	}
	@Test
	public void test3() {
		playerMapper.selectList(null).forEach(em->{
			System.out.println(em.toString());
		});
	}
}
