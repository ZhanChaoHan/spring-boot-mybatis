package com.jachs.mybatis.entity;

import java.io.Serializable;

public class My_student implements Serializable {
    private Integer studentId;

    private Integer studentAge;

    private Integer studentGender;

    private String studentName;

    private Integer classid;

    private static final long serialVersionUID = 1L;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public Integer getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(Integer studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }
}