package com.jachs.mybatis;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jachs.mybatis.entity.Computer;
import com.jachs.mybatis.mapper.ComputerMapper;

@SpringBootTest(classes =MybatisPlusApplication.class )
public class ComputerMapperTest {
	@Autowired
	private ComputerMapper computerMapper;
	
	@Test
	public void test() {
		Computer cp=computerMapper.selectById("cid");
		
		System.out.println(cp.getComputerName());
	}
	//查询全部
	@Test
	public void test1() {
		List<Computer>  cList=computerMapper.selectList(null);
		for (Computer computer : cList) {
			System.out.println(computer.getComputerId());
		}
	}
}
