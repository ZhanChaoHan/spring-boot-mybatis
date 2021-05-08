package com.jachs.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.jachs.mybatis.entity.Soft_ware;

public interface Soft_wareMapper {
    int deleteByPrimaryKey(String softWareId);
    int insert(Soft_ware record);
    int insertSelective(Soft_ware record);
    Soft_ware selectByPrimaryKey(String softWareId);
    int updateByPrimaryKeySelective(Soft_ware record);
    int updateByPrimaryKey(Soft_ware record);
    List<Soft_ware> selectAll();
	List<Soft_ware> selectByCid(String cid);
	Soft_ware selectByCidAndSoftWareName(String cid, String softname);
	Soft_ware selectByCidAndSoftWareName_1(@Param("p1")String string,@Param("p2") String string2);
	Soft_ware selectByCidAndSoftWareName_2(Map<String, String> maps);
}