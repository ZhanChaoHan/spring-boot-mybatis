package com.jachs.mybatis.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.github.pagehelper.PageHelper;
import com.jachs.mybatis.Application;
import com.jachs.mybatis.entity.Computer;

/***
 * 
 * @author zhanchaohan
 *
 */
@SpringBootTest(classes = Application.class)
public class ComputerTest {
	@Autowired
	private ComputerMapper computerMapper;
	
	@Test
	public void test() {
		Computer cp=new Computer();
		cp.setComputerId(24+"");
		cp.setComputerName("nams");
		cp.setComputerPrice(15875L);
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
			System.out.println(computer.toString());
		}
	}
	//分页
	@Test
	public void test3() {
		int pageNum=2;
		int pageSize=2;
		PageHelper.startPage(pageNum,pageSize);
		
		List<Computer>cpList=computerMapper.findAllComputer();
		for (Computer computer : cpList) {
			System.out.println(computer.toString());
		}
	}
}
