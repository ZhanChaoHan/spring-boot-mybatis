package com.jachs.mybatis.dao.generator.wrapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jachs.mybatis.mapper.ComputerMapper;

/***
 * 
 * @author zhanchaohan
 *
 */
@SpringBootTest
public class WrapperJoinMapperDemo {
	@Autowired
	private ComputerMapper computerMapper;
	
	@Test
	public void test1() {
		computerMapper.selectJoinList(null, null);
		
	}
}
