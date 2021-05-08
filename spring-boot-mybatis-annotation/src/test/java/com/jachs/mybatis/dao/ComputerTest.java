package com.jachs.mybatis.dao;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jachs.mybatis.Application;
import com.jachs.mybatis.entity.Computer;

@SpringBootTest(classes = Application.class)
public class ComputerTest {
	@Autowired
	private ComputerMapper computerMapper;
	
	@Test
	public void test() {
		Computer cp=new Computer();
		cp.setComputer_id(24+"");
		cp.setComputer_name("nams");
		cp.setComputer_price(15875L);
		computerMapper.addComputer(cp);
	}
	@Test
	public void test1() {
		System.out.println(computerMapper.deleteComputer("24"));
	}
	@Test
	public void test2() {
		List<Computer>cpList=computerMapper.findAllComputer();
		for (Computer computer : cpList) {
			System.out.println(computer.getComputer_name());
		}
		
	}
}
