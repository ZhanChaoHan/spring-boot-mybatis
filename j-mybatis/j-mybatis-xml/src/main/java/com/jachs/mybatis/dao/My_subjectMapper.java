package com.jachs.mybatis.dao;

import com.jachs.mybatis.entity.My_subject;

public interface My_subjectMapper {
    int deleteByPrimaryKey(Integer subjectId);

    int insert(My_subject record);

    int insertSelective(My_subject record);

    My_subject selectByPrimaryKey(Integer subjectId);

    int updateByPrimaryKeySelective(My_subject record);

    int updateByPrimaryKey(My_subject record);
}