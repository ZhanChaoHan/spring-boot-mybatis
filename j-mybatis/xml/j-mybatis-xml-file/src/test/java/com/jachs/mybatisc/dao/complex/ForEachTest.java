package com.jachs.mybatisc.dao.complex;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jachs.mybatis.Application;
import com.jachs.mybatis.dao.SoftwareMapper;
import com.jachs.mybatis.entity.Software;

/***
 * 
 * @author zhanchaohan
 *
 */
@SpringBootTest(classes = Application.class)
public class ForEachTest {
	@Autowired
	private SoftwareMapper software;
	
	@Test
	public void test1() {
		List<String>idList=new ArrayList<String>();
		idList.add("ACSVRVSMUF");
		idList.add("ATAMTQKHOA");
		idList.add("BLDDDUALYE");
		List<Software>swList=software.queryManyById(idList);
		
		swList.forEach(sw->{
			System.out.println(sw.toString());
		});
	}
}
