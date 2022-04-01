package com.jachs.mybatisc.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jachs.mybatis.Application;
import com.jachs.mybatis.dao.ComputerMapper;
import com.jachs.mybatis.dao.Soft_wareMapper;
import com.jachs.mybatis.entity.Computer;
import com.jachs.mybatis.entity.Soft_ware;

/****
 * 简单查询，条件查询
 * @author zhanchaohan
 *
 */
@SpringBootTest(classes = Application.class)
public class ComputerMapperTest {
	@Autowired
	private ComputerMapper computerMapper;
	@Autowired
	private Soft_wareMapper soft_wareMapper;
	
	private static final String cId="pid";
	
	@Test
	public void test1() {
		Computer computer=new Computer();
		
		computer.setComputerId(cId);
		computer.setComputerName("XXAA");
		computer.setComputerPrice(15287L);
		computerMapper.insert(computer);
	}
	@Test
	public void test2() {
		RandomStringUtils rsu=new RandomStringUtils();
		for (int kk = 100; kk < 200; kk++) {
			Soft_ware sw=new Soft_ware();
			sw.setCid(cId);
			
			sw.setSoftWareId(kk+"");
			sw.setSoftWareName(rsu.randomAlphanumeric(6));
			soft_wareMapper.insert(sw);
		}
	}
	//单查询
	@Test
	public void test3() {
		Soft_ware soft_ware=soft_wareMapper.selectByPrimaryKey("1");
		System.out.println(soft_ware.getCid());
		System.out.println(soft_ware.getSoftWareId());
		System.out.println(soft_ware.getSoftWareName());
	}
	//指定名称传参
	@Test
	public void test4() {
		Soft_ware sw=soft_wareMapper.selectByCidAndSoftWareName("cid","x1KsYN");
		
		System.out.println(sw.getSoftWareId());
	}
	//@Param注解
	@Test
	public void test5() {
		Soft_ware sw=soft_wareMapper.selectByCidAndSoftWareName_1("cid","x1KsYN");
		
		System.out.println(sw.getSoftWareId());
	}
	//map传参
	@Test
	public void test6() {
		Map<String, String>maps=new HashMap<String, String>();
		maps.put("a", "cid");
		maps.put("b", "x1KsYN");
		Soft_ware sw=soft_wareMapper.selectByCidAndSoftWareName_2(maps);
		
		System.out.println(sw.getSoftWareId());
	}
	//id查询
	@Test
	public void test7() {
		List<Soft_ware>swList=soft_wareMapper.selectByCid(cId);
		System.out.println(swList.size());
	}
	
}
