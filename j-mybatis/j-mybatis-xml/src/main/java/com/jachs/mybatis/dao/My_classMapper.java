package com.jachs.mybatis.dao;

import com.jachs.mybatis.entity.My_class;

public interface My_classMapper {
    int deleteByPrimaryKey(Integer classId);

    int insert(My_class record);

    int insertSelective(My_class record);

    My_class selectByPrimaryKey(Integer classId);

    int updateByPrimaryKeySelective(My_class record);

    int updateByPrimaryKey(My_class record);
}