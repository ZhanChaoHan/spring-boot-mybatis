package com.jachs.springmybatis.dao;

import com.jachs.springmybatis.entity.Software;

public interface SoftwareMapper {
    int deleteByPrimaryKey(String softwareid);

    int insert(Software record);

    int insertSelective(Software record);

    Software selectByPrimaryKey(String softwareid);

    int updateByPrimaryKeySelective(Software record);

    int updateByPrimaryKey(Software record);
}