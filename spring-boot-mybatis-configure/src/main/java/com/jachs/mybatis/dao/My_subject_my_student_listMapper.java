package com.jachs.mybatis.dao;

import com.jachs.mybatis.entity.My_subject_my_student_list;

public interface My_subject_my_student_listMapper {
    int insert(My_subject_my_student_list record);

    int insertSelective(My_subject_my_student_list record);
}