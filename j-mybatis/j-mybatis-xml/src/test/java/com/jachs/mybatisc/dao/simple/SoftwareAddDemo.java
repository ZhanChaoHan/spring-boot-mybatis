package com.jachs.mybatisc.dao.simple;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jachs.mybatis.Application;
import com.jachs.mybatis.dao.ComputerMapper;
import com.jachs.mybatis.dao.SoftwareMapper;
import com.jachs.mybatis.entity.Computer;
import com.jachs.mybatis.entity.Software;

/***
 * @author zhanchaohan
 *
 */
@SpringBootTest(classes = Application.class)
public class SoftwareAddDemo {
	@Autowired
	private  ComputerMapper computerMapper;
	@Autowired
	private  SoftwareMapper softwareMapper;
	
	private  Set<String>cpID=new HashSet<String>();
	
	public  void initPid() {
		List<Computer>cpList=computerMapper.findAll();
		cpList.forEach(cp->{
			cpID.add(cp.getComputerid());
		});
	}
	@Test
	public void test1() {
		initPid();
		Random ran=new Random();
		RandomStringUtils rsu=new RandomStringUtils();
		
		cpID.forEach(cpiD->{
			int count=ran.nextInt(10);
			
			for (int kk = 0; kk < count; kk++) {
				Software sw=new Software();
				
				sw.setSoftwareid(rsu.random(10, "ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
				sw.setSoftwarename(rsu.random(20,"苹果ACER联想QQ腾讯阿里巴巴微信数据库C#Google"));
				sw.setCfkid(cpiD);
				
				softwareMapper.insert(sw);
			}
		});
	}
}
