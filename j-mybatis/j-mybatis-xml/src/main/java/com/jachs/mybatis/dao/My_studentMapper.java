package com.jachs.mybatis.dao;

import com.jachs.mybatis.entity.My_student;

public interface My_studentMapper {
    int deleteByPrimaryKey(Integer studentId);

    int insert(My_student record);

    int insertSelective(My_student record);

    My_student selectByPrimaryKey(Integer studentId);

    int updateByPrimaryKeySelective(My_student record);

    int updateByPrimaryKey(My_student record);
}