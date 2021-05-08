package com.jachs.mybatis.dao;

import com.jachs.mybatis.entity.Exam;

public interface ExamMapper {
    int deleteByPrimaryKey(Integer examId);

    int insert(Exam record);

    int insertSelective(Exam record);

    Exam selectByPrimaryKey(Integer examId);

    int updateByPrimaryKeySelective(Exam record);

    int updateByPrimaryKey(Exam record);
}