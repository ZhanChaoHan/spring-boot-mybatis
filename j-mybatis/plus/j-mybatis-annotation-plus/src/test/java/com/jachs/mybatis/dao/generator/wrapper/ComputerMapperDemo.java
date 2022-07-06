package com.jachs.mybatis.dao.generator.wrapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.jachs.mybatis.domain.Computer;
import com.jachs.mybatis.mapper.ComputerMapper;

/***
 * 
 * @author zhanchaohan
 *
 */
@SpringBootTest
public class ComputerMapperDemo {
	@Autowired
	private ComputerMapper computerMapper;
	
	@Test
	public void test1() {
		LambdaQueryWrapper<Computer>wrapper=new LambdaQueryWrapper<Computer>();
		
		wrapper.eq(Computer::getComputername, "硰頝涼熲阯摨鼸鴑肪读桰暍渿拞炷鲶鉕敌舻耝");
		
		Computer cp=computerMapper.selectOne(wrapper);
		
		System.out.println(cp.toString());
	}
	@Test
	public void test2() {
		UpdateWrapper<Computer> updateWrapper=new UpdateWrapper<Computer>();
		
		Computer cp=new Computer();
		cp.setComputerprice(9L);
		updateWrapper.eq("computername", "硰頝涼熲阯摨鼸鴑肪读桰暍渿拞炷鲶鉕敌舻耝");
		
		computerMapper.update(cp, updateWrapper);
	}
	@Test
	public void test3() {
		QueryWrapper<Computer>query=new QueryWrapper<Computer>();
		
		query.select("computerName","computerPrice")//要取的字段
		.like("computerId", "%B%")
		.between("computerPrice", 290, 3257);
		
		computerMapper.selectList(query).forEach(cp->{
			System.out.println(cp.toString());
		});
	}
}
