package com.jachs.mybatisc.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jachs.mybatis.Application;
import com.jachs.mybatis.dao.ComputerMapper;

/***
 * 聚合
 * @author zhanchaohan
 *
 */
@SpringBootTest(classes = Application.class)
public class PolymerizationtTest {
	@Autowired
	private ComputerMapper computerMapper;
	
	//count
	@Test
	public void test() {
		int count=computerMapper.count();
		
		System.out.println(count);
	}
}
