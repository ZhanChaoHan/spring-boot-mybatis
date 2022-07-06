package com.jachs.mybatis.dao;

import com.jachs.mybatis.entity.Computer;

public interface ComputerMapper {
    int deleteByPrimaryKey(String computerid);

    int insert(Computer record);

    int insertSelective(Computer record);

    Computer selectByPrimaryKey(String computerid);

    int updateByPrimaryKeySelective(Computer record);

    int updateByPrimaryKey(Computer record);
}