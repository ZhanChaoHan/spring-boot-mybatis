package com.jachs.mybatisc.dao.simple;

import java.util.Date;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jachs.mybatis.Application;
import com.jachs.mybatis.dao.ComputerMapper;
import com.jachs.mybatis.entity.Computer;

/****
 * @author zhanchaohan
 *
 */
@SpringBootTest(classes = Application.class)
public class ComputerAddDemo {
	@Autowired
	private ComputerMapper computerMapper;
	
	//单条添加
	@Test
	public void test1() {
		Computer computer=new Computer();
		
		computer.setComputerid("pid");
		computer.setComputername("Acer");
		computer.setComputerprice(15287L);
		computer.setMadetime(new Date());
		computerMapper.insert(computer);
	}
	//多条添加
	@Test
	public void test2() {
		Random ran=new Random();
		RandomStringUtils rsu=new RandomStringUtils();
		DateUtils du=new DateUtils();
		Date date=new Date();
		
		for (int kk = 0; kk < 50; kk++) {
			Computer computer=new Computer();
			
			computer.setComputerid(rsu.random(10, "ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
			computer.setComputername(rsu.random(20, 0x4e00, 0x9fa5, false,false));
			computer.setComputerprice(new Long(ran.nextInt(10000)));
			computer.setMadetime(du.addDays(date, ran.nextInt(100)));
			
			computerMapper.insert(computer);
		}
	}
	//打印行数
	@Test
	public void test3() {
		Long count=computerMapper.allCount();
		
		System.out.println(count);
	}
}
