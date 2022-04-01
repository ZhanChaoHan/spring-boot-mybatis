package com.jachs.mybatis.entity;

import java.io.Serializable;

public class My_subject implements Serializable {
    private Integer subjectId;

    private String subjectName;

    private static final long serialVersionUID = 1L;

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }
}