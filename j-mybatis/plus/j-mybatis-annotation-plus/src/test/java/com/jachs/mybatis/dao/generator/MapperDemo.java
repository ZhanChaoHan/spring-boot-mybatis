package com.jachs.mybatis.dao.generator;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jachs.mybatis.Application;
import com.jachs.mybatis.domain.Computer;
import com.jachs.mybatis.service.ComputerService;

/***
 * 
 * @author zhanchaohan
 *
 */
@SpringBootTest(classes = Application.class)
public class MapperDemo {
	@Autowired
	private ComputerService computerService;
	
	@Test
	public void test1() {
		List<Computer>  cmList=computerService.list(null);
		
		cmList.forEach(cp->{
			System.out.println(cp.toString());
		});
	}
}
