package com.jachs.mybatis.multiple.d2.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhanchaohan
 * @since 2022-07-06
 */
public class Student extends Model<Student> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "${field.annotationColumnName}", type = IdType.AUTO)
    private String studentId;

    @TableField("${field.annotationColumnName}")
    private Date dateOfBirth;

    @TableField("${field.annotationColumnName}")
    private Integer studentAge;

    @TableField("${field.annotationColumnName}")
    private String studentName;

    @TableField("${field.annotationColumnName}")
    private String sCarId;


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
        this.studentName = studentName;
    }

    public String getsCarId() {
        return sCarId;
    }

    public void setsCarId(String sCarId) {
        this.sCarId = sCarId;
    }

    @Override
	public Serializable pkVal() {
        return this.studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
        "studentId=" + studentId +
        ", dateOfBirth=" + dateOfBirth +
        ", studentAge=" + studentAge +
        ", studentName=" + studentName +
        ", sCarId=" + sCarId +
        "}";
    }
}
