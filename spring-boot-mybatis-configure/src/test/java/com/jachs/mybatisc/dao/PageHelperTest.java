package com.jachs.mybatisc.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.github.pagehelper.PageHelper;
import com.jachs.mybatis.Application;
import com.jachs.mybatis.dao.Soft_wareMapper;
import com.jachs.mybatis.entity.Soft_ware;

/***
 * 分页
 * @author zhanchaohan
 *
 */
@SpringBootTest(classes = Application.class)
public class PageHelperTest {
	@Autowired
	private Soft_wareMapper soft_wareMapper;

	// page helper分页
	@Test
	public void test1() {
		System.out.println("第一页-----------------------");
		PageHelper.startPage(1, 10);
		List<Soft_ware> swList = soft_wareMapper.selectAll();
		for (Soft_ware soft_ware : swList) {
			System.out.println(soft_ware.getSoftWareId());
		}
		System.out.println("第二页-----------------------");
		PageHelper.startPage(2, 10);
		List<Soft_ware> swList1 = soft_wareMapper.selectAll();
		for (Soft_ware soft_ware : swList1) {
			System.out.println(soft_ware.getSoftWareId());
		}

	}

	// 分页排序
	@Test
	public void test2() {
		String orderBy = "cid desc";//// 按照排序字段 倒序 排序

		System.out.println("第一页-----------------------");
		PageHelper.startPage(1, 10, orderBy);
		List<Soft_ware> swList = soft_wareMapper.selectAll();
		for (Soft_ware soft_ware : swList) {
			System.out.println(soft_ware.getSoftWareId());
		}
		System.out.println("第二页-----------------------");
		PageHelper.startPage(2, 10, orderBy);
		List<Soft_ware> swList1 = soft_wareMapper.selectAll();
		for (Soft_ware soft_ware : swList1) {
			System.out.println(soft_ware.getSoftWareId());
		}

	}
}
