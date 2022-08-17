package com.jachs.springmybatis;

import java.util.Date;
import java.util.Locale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.javafaker.Faker;
import com.jachs.springmybatis.dao.ComputerMapper;
import com.jachs.springmybatis.entity.Computer;

/**
 * 
 * @author zhanchaohan
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring.xml"})
public class ComputerMapperTest {
	private static Faker FAKER = new Faker(Locale.CHINA);
	@Autowired
	private ComputerMapper computerMapper;
	
	@Test
	public void t1() {
		Computer cp=new Computer();
		
		cp.setComputerid(FAKER.app().author());
		cp.setComputername(FAKER.company().name());
		cp.setComputerprice(FAKER.number().randomNumber());
		cp.setMadetime(new Date());
		computerMapper.insert(cp);
	}
}
