package com.jachs.mybatis.entity;

import java.io.Serializable;

public class Examinee implements Serializable {
    private Integer examineeId;

    private String examineeName;

    private static final long serialVersionUID = 1L;

    public Integer getExamineeId() {
        return examineeId;
    }

    public void setExamineeId(Integer examineeId) {
        this.examineeId = examineeId;
    }

    public String getExamineeName() {
        return examineeName;
    }

    public void setExamineeName(String examineeName) {
        this.examineeName = examineeName == null ? null : examineeName.trim();
    }
}