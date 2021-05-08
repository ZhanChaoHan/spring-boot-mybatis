package com.jachs.mybatis.entity;

import java.io.Serializable;

public class Exam implements Serializable {
    private Integer examId;

    private String examName;

    private Double score;

    private static final long serialVersionUID = 1L;

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName == null ? null : examName.trim();
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}