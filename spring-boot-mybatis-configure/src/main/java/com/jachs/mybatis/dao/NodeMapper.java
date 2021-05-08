package com.jachs.mybatis.dao;

import com.jachs.mybatis.entity.Node;

public interface NodeMapper {
    int deleteByPrimaryKey(Long nodeId);

    int insert(Node record);

    int insertSelective(Node record);

    Node selectByPrimaryKey(Long nodeId);

    int updateByPrimaryKeySelective(Node record);

    int updateByPrimaryKey(Node record);
}