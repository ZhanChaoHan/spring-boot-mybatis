package com.jachs.mybatis.dao;

import com.jachs.mybatis.entity.Link;

public interface LinkMapper {
    int deleteByPrimaryKey(Long linkId);

    int insert(Link record);

    int insertSelective(Link record);

    Link selectByPrimaryKey(Long linkId);

    int updateByPrimaryKeySelective(Link record);

    int updateByPrimaryKey(Link record);
}