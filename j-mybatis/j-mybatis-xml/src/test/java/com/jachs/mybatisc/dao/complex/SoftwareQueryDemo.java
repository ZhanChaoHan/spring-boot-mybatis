package com.jachs.mybatisc.dao.complex;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jachs.mybatis.Application;
import com.jachs.mybatis.dao.SoftwareMapper;
import com.jachs.mybatis.dto.SoftWareDto;
import com.jachs.mybatis.entity.Software;
import com.jachs.mybatis.vo.SoftWareVo;

/****
 * @author zhanchaohan
 *
 */
@SpringBootTest(classes = Application.class)
public class SoftwareQueryDemo {
	@Autowired
	private SoftwareMapper software;
	
	//连表查询
	@Test
	public void test1() {
		List<Software>swList=software.findByCpId("NJKSLVUSBA");
		
		swList.forEach(sw->{
			System.out.println(sw.toString());
		});
	}
	//bean查询
	@Test
	public void test2() {
		SoftWareVo swv=new SoftWareVo("NJKSLVUSBA","信");
		
		List<Software>swList=software.findBycIdAndName(swv);
		
		swList.forEach(sw->{
			System.out.println(sw.toString());
		});
	}
	//bean查询返回dto
	@Test
	public void test3() {
		SoftWareVo swv=new SoftWareVo("NJKSLVUSBA","信");
		List<SoftWareDto>swList=software.findBycIdAndNameDto(swv);
		
		swList.forEach(sw->{
			System.out.println(sw.toString());
		});
	}
}
