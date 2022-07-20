package com.jachs.mybatis.cache;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.jachs.mybatis.cache.entity.SoftwareEntity;
import com.jachs.mybatis.cache.service.ISoftwareService;

/***
 * 
 * @author zhanchaohan
 *
 */
@SpringBootTest(classes = Application.class)
public class SoftwareTest {
	@Autowired
	private ISoftwareService iSoftwareService;
	
	private String swId="ACWPLDBLHU";
	
	@Test
	public void test1() {
		List<SoftwareEntity>swList=iSoftwareService.findAllByXml();
		
		swList.forEach(sw->{
			System.out.println(sw.toString());
		});
	}
	@Test
	public void test2() {
		UpdateWrapper<SoftwareEntity>swWrapper=new UpdateWrapper<SoftwareEntity>();
		swWrapper.eq("softWareId", swId);
		
		SoftwareEntity sw=new SoftwareEntity();
		sw.setSoftWareName("更新6");
		
		iSoftwareService.update(sw, swWrapper);
	}
	//不走xml是没有缓存
	@Test
	public void test3() {
		LambdaQueryWrapper<SoftwareEntity>wrapper=new LambdaQueryWrapper<SoftwareEntity>();
		wrapper.eq(SoftwareEntity::getSoftWareId, swId);
		
		System.out.println(iSoftwareService.getOne(wrapper).toString());
	}
	//走xml因为开启缓存会缓存更新前数据
	@Test
	public  void test5() {
		SoftwareEntity se=iSoftwareService.findById(swId);
		
		System.out.println(se.toString());
	}
}
