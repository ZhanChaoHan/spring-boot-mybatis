package com.jachs.mybatis.dao;

import com.jachs.mybatis.entity.Software;

public interface SoftwareMapper {
    int deleteByPrimaryKey(String softwareid);

    int insert(Software record);

    int insertSelective(Software record);

    Software selectByPrimaryKey(String softwareid);

    int updateByPrimaryKeySelective(Software record);

    int updateByPrimaryKey(Software record);
}