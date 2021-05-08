package com.jachs.mybatis.entity;

import java.io.Serializable;

public class Exam_examineesKey implements Serializable {
    private Integer examExamId;

    private Integer examineesExamineeId;

    private static final long serialVersionUID = 1L;

    public Integer getExamExamId() {
        return examExamId;
    }

    public void setExamExamId(Integer examExamId) {
        this.examExamId = examExamId;
    }

    public Integer getExamineesExamineeId() {
        return examineesExamineeId;
    }

    public void setExamineesExamineeId(Integer examineesExamineeId) {
        this.examineesExamineeId = examineesExamineeId;
    }
}