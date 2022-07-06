package com.jachs.mybatis.dao.generator.add;

import java.util.Date;

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
public class ComputerAdd {
	@Autowired
	private ComputerService computerService;
	
	@Test
	public void ts1() {
		Computer cp=new Computer();
		cp.setComputerid("cp_001");
		cp.setComputername("测试主机");
		cp.setComputerprice(198292L);
		cp.setMadetime(new Date());
		
		computerService.save(cp);
	}
}
