package com.jachs.mybatis.entity;

import java.io.Serializable;

public class My_subject_my_student_list implements Serializable {
    private Integer mySubjectSubjectId;

    private Integer myStudentListStudentId;

    private static final long serialVersionUID = 1L;

    public Integer getMySubjectSubjectId() {
        return mySubjectSubjectId;
    }

    public void setMySubjectSubjectId(Integer mySubjectSubjectId) {
        this.mySubjectSubjectId = mySubjectSubjectId;
    }

    public Integer getMyStudentListStudentId() {
        return myStudentListStudentId;
    }

    public void setMyStudentListStudentId(Integer myStudentListStudentId) {
        this.myStudentListStudentId = myStudentListStudentId;
    }
}