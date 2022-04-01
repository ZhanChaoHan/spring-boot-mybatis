package com.jachs.mybatis.entity;

import java.io.Serializable;

public class Example implements Serializable {
    private Integer id;

    private Integer score;

    private Integer myStudentId;

    private Integer mySubjectId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getMyStudentId() {
        return myStudentId;
    }

    public void setMyStudentId(Integer myStudentId) {
        this.myStudentId = myStudentId;
    }

    public Integer getMySubjectId() {
        return mySubjectId;
    }

    public void setMySubjectId(Integer mySubjectId) {
        this.mySubjectId = mySubjectId;
    }
}