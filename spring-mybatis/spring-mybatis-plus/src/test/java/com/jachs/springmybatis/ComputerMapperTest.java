package com.jachs.springmybatis;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.javafaker.Faker;
import com.jachs.springmybatis.entity.ComputerEntity;
import com.jachs.springmybatis.mapper.ComputerMapper;

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
		ComputerEntity cp=new ComputerEntity();
		
		cp.setComputerId(FAKER.app().author());
		cp.setComputerName(FAKER.company().name());
		cp.setComputerPrice(FAKER.number().randomNumber());
		cp.setMadeTime(LocalDateTime.now());
		computerMapper.insert(cp);
	}
}
