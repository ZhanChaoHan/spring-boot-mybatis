package com.jachs.mybatis.entity;

import java.io.Serializable;

public class Examinee_examsKey implements Serializable {
    private Integer examineeExamineeId;

    private Integer examsExamId;

    private static final long serialVersionUID = 1L;

    public Integer getExamineeExamineeId() {
        return examineeExamineeId;
    }

    public void setExamineeExamineeId(Integer examineeExamineeId) {
        this.examineeExamineeId = examineeExamineeId;
    }

    public Integer getExamsExamId() {
        return examsExamId;
    }

    public void setExamsExamId(Integer examsExamId) {
        this.examsExamId = examsExamId;
    }
}