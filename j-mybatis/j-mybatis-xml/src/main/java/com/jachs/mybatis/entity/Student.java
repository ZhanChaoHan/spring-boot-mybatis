package com.jachs.mybatis.entity;

import java.io.Serializable;

public class Student implements Serializable {
    private String studentId;

    private Integer studentAge;

    private String studentName;

    private String sCart;

    private static final long serialVersionUID = 1L;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getsCart() {
        return sCart;
    }

    public void setsCart(String sCart) {
        this.sCart = sCart == null ? null : sCart.trim();
    }
}