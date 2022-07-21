package com.jachs.mybatis.cache;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.jachs.mybatis.cache.entity.ComputerEntity;
import com.jachs.mybatis.cache.entity.dto.CpDto;
import com.jachs.mybatis.cache.service.IComputerService;

/***
 * Mapper上加的缓存整个mapper 增删改查都被缓存,手动改库后查询缓存生效
 * @author zhanchaohan
 *
 */
@SpringBootTest(classes = Application.class)
public class ComputerTest {
	@Autowired
	private IComputerService iComputerService;
	
	private String cpId="PWRMGMKLOA";
	
	@Test
	public void test1() {
		LambdaQueryWrapper<ComputerEntity>cWrapper=new LambdaQueryWrapper<ComputerEntity>();
		
		cWrapper.eq(ComputerEntity::getComputerId, cpId);
		System.out.println(iComputerService.getOne(cWrapper).toString());
	}
	@Test
	public void test5() {
		List<CpDto>cpList=iComputerService.queryCpDto(cpId);
		
		cpList.forEach(cpd->{
			System.out.println(cpd.toString());
		});
	}
	@Test
	public void test2() {
		UpdateWrapper<ComputerEntity>cpWrapper=new UpdateWrapper<ComputerEntity>();
		cpWrapper.eq("computerId", cpId);
		
		ComputerEntity ce=new ComputerEntity();
		ce.setComputerPrice(8888L);
		iComputerService.update(ce,cpWrapper);
	}
}
