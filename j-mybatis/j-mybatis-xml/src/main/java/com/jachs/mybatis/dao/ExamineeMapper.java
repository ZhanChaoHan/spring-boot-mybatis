package com.jachs.mybatis.dao;

import com.jachs.mybatis.entity.Examinee;

public interface ExamineeMapper {
    int deleteByPrimaryKey(Integer examineeId);

    int insert(Examinee record);

    int insertSelective(Examinee record);

    Examinee selectByPrimaryKey(Integer examineeId);

    int updateByPrimaryKeySelective(Examinee record);

    int updateByPrimaryKey(Examinee record);
}