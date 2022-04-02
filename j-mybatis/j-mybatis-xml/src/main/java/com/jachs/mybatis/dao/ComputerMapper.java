package com.jachs.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.jachs.mybatis.entity.Computer;

public interface ComputerMapper {
    int deleteByPrimaryKey(String computerid);

    int insert(Computer record);

    int insertSelective(Computer record);

    Computer selectByPrimaryKey(String computerid);

    int updateByPrimaryKeySelective(Computer record);

    int updateByPrimaryKey(Computer record);
    //查询
	Long allCount();
	List<Computer> findAll();
	Computer findByNameAndPrice(@Param("cname") String cpName,@Param("cprice") long price);
	Computer findByNameAndPriceAndMadeTime(Map<String,Object> map);
	List<Computer> findIdLike(@Param("cid") String id);
}