package com.jachs.mybatis.dao;

import com.jachs.mybatis.entity.Example;

public interface ExampleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Example record);

    int insertSelective(Example record);

    Example selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Example record);

    int updateByPrimaryKey(Example record);
}