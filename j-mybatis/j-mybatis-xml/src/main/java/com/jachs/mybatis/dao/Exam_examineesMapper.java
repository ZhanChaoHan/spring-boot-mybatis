package com.jachs.mybatis.dao;

import com.jachs.mybatis.entity.Exam_examineesKey;

public interface Exam_examineesMapper {
    int deleteByPrimaryKey(Exam_examineesKey key);

    int insert(Exam_examineesKey record);

    int insertSelective(Exam_examineesKey record);
}