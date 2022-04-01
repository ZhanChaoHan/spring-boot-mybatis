package com.jachs.mybatis.dao;

import com.jachs.mybatis.entity.Examinee_examsKey;

public interface Examinee_examsMapper {
    int deleteByPrimaryKey(Examinee_examsKey key);

    int insert(Examinee_examsKey record);

    int insertSelective(Examinee_examsKey record);
}