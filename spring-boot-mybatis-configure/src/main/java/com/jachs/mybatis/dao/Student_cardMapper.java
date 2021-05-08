package com.jachs.mybatis.dao;

import com.jachs.mybatis.entity.Student_card;

public interface Student_cardMapper {
    int deleteByPrimaryKey(String cardId);

    int insert(Student_card record);

    int insertSelective(Student_card record);

    Student_card selectByPrimaryKey(String cardId);

    int updateByPrimaryKeySelective(Student_card record);

    int updateByPrimaryKey(Student_card record);
}