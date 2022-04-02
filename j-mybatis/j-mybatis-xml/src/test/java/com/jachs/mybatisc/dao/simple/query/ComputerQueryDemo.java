package com.jachs.mybatisc.dao.simple.query;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jachs.mybatis.Application;
import com.jachs.mybatis.dao.ComputerMapper;
import com.jachs.mybatis.entity.Computer;

/****
 * @author zhanchaohan
 *
 */
@SpringBootTest(classes = Application.class)
public class ComputerQueryDemo {
	@Autowired
	private ComputerMapper computerMapper;
	
	//id查询
	@Test
	public void test1() {
		Computer cp=computerMapper.selectByPrimaryKey("ABZTUKPYPB");
		
		System.out.println(cp.toString());
	}
	//多条件查询,@Param注解传参法
	@Test
	public void test2() {
		Computer cp=computerMapper.findByNameAndPrice("囩歺鰂遐婤鎟闡撱蘔啣歡渤聞列稚豻耆蕓廋寏",1530L);
	
		System.out.println(cp.toString());
	}
	//多条件查询,Map传参法
	@Test
	public void test3() {
		Map<String,Object>data=new HashMap<String,Object>();
		data.put("name", "半绢図凞碦荊縄棺鰫酁詯姉轭湙齉摲炒搴铙獛");
		data.put("pri", 9267);
		
		Computer cp=computerMapper.findByNameAndPriceAndMadeTime(data);
		System.out.println(cp.toString());
	}
	//like 查询
	@Test
	public void test5() {
		List<Computer> cpList=computerMapper.findIdLike("A");
		
		cpList.forEach(cp->{
			System.out.println(cp.toString());
		});
	}
}
