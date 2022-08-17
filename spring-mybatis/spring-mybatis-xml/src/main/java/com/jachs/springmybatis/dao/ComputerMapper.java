package com.jachs.springmybatis.dao;

import org.apache.ibatis.annotations.Mapper;

import com.jachs.springmybatis.entity.Computer;

@Mapper
public interface ComputerMapper {
    int deleteByPrimaryKey(String computerid);

    int insert(Computer record);

    int insertSelective(Computer record);

    Computer selectByPrimaryKey(String computerid);

    int updateByPrimaryKeySelective(Computer record);

    int updateByPrimaryKey(Computer record);
}