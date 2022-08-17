package com.jachs.springmybatis.dao;

import org.apache.ibatis.annotations.Mapper;

import com.jachs.springmybatis.entity.Software;

@Mapper
public interface SoftwareMapper {
    int deleteByPrimaryKey(String softwareid);

    int insert(Software record);

    int insertSelective(Software record);

    Software selectByPrimaryKey(String softwareid);

    int updateByPrimaryKeySelective(Software record);

    int updateByPrimaryKey(Software record);
}