package com.jachs.mybatis.dynamic;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.jachs.mybatis.dynamic.entity.ComputerEntity;
import com.jachs.mybatis.dynamic.mapper.ComputerMapper;

/***
 * 
 * @author zhanchaohan
 *
 */
@SpringBootTest
public class DsTest {
	@Autowired
	private ComputerMapper computerMapper;
	
	@Test
	public void test1() {
		computerMapper.selectList(null).forEach(cp->{
			System.out.println(cp.toString());
		});
	}
	
	@Test
	public void test2() {
		ComputerEntity ce=new ComputerEntity();
		
		ce.setComputerId("ckck");
		ce.setComputerName("测试");
		ce.setComputerPrice(18293L);
		ce.setMadeTime(LocalDateTime.now());
		
		computerMapper.insert(ce);
	}
	/***
	 * 先添加一条测试数据，然后修改mapper的Ds测试这条数据切换ds后是否能查
	 */
	@Test
	public void test3() {
		LambdaQueryWrapper<ComputerEntity>wrapper=new LambdaQueryWrapper<ComputerEntity>();
		
		wrapper.eq(ComputerEntity::getComputerId, "ckck");
		
		ComputerEntity cp=computerMapper.selectOne(wrapper);
		
		System.out.println(cp.toString());
	}
}
