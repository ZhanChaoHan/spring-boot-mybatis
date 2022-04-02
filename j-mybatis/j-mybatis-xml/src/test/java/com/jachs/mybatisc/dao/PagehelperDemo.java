package com.jachs.mybatisc.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.github.pagehelper.PageHelper;
import com.jachs.mybatis.Application;
import com.jachs.mybatis.dao.ComputerMapper;
import com.jachs.mybatis.entity.Computer;

/***
 * 
 * @author zhanchaohan
 *
 */
@SpringBootTest(classes = Application.class)
public class PagehelperDemo {
	@Autowired
	private ComputerMapper computerMapper;
	
	@Test
	public void test1() {
		int pageNum=2;
		int pageSize=2;
		PageHelper.startPage(pageNum,pageSize);
		//注意：只有紧跟着PageHelper.startPage()的sql语句才被pagehelper起作用
		List<Computer> cList=computerMapper.findAll();
		
		cList.forEach(a->{
			System.out.println(a.toString());
		});
	}
}
