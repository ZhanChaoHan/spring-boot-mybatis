package com.jachs.mybatis.dao.generator.query.wrapper.page;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageHelper;
import com.jachs.mybatis.domain.Computer;
import com.jachs.mybatis.mapper.ComputerMapper;

/***
 * 
 * @author zhanchaohan
 *
 */
@SpringBootTest
public class PageDemo {
	@Autowired
	private ComputerMapper computerMapper;
	
	//wrapper方式
	@Test
	public void test1() {
		LambdaQueryWrapper<Computer>wrapper=new LambdaQueryWrapper<Computer>();
		
		wrapper.ge(Computer::getComputerprice, 10L);
		
		wrapper.orderByAsc(Computer::getComputerprice);
		
		Page<Computer> page=new Page<Computer>(3, 2);
		
		IPage<Computer> pageList=computerMapper.selectPage(page, wrapper);
		
		pageList.getRecords().forEach(cp->{
			System.out.println(cp.toString());
		});
	}
	//xml+PageHelper方式
	@Test
	public void test2() {
		int pageNum=3;
		int pageSize=2;
		PageHelper.startPage(pageNum,pageSize);
		List<Computer>cpList=computerMapper.selectPageByXml(10L);
		
		cpList.forEach(cp->{
			System.out.println(cp.toString());
		});
	}
	//xml+Page方式
	@Test
	public void test3() {
		Page<Computer> page=new Page<Computer>(4, 2);
		List<Computer>cpList=computerMapper.selectPageByXml(10L,page);
		
		cpList.forEach(cp->{
			System.out.println(cp.toString());
		});
	}
	//注解+PageHelper
	@Test
	public void test5() {
		int pageNum=3;
		int pageSize=2;
		PageHelper.startPage(pageNum,pageSize);
		List<Computer>cpList=computerMapper.selectPageByAnn(10L);
		
		cpList.forEach(cp->{
			System.out.println(cp.toString());
		});
	}
	//注解+Page
	@Test
	public void test6() {
		Page<Computer> page=new Page<Computer>(4, 2);
		List<Computer>cpList=computerMapper.selectPageByAnn(10L,page);
		
		cpList.forEach(cp->{
			System.out.println(cp.toString());
		});
	}
}
