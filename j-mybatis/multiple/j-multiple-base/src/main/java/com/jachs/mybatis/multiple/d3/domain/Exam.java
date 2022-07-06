package com.jachs.mybatis.multiple.d3.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
public class Exam extends Model<Exam> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "${field.annotationColumnName}", type = IdType.AUTO)
    private Integer examId;

    @TableField("${field.annotationColumnName}")
    private String examName;

    @TableField("${field.annotationColumnName}")
    private Double score;


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
        this.examName = examName;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
	public Serializable pkVal() {
        return this.examId;
    }

    @Override
    public String toString() {
        return "Exam{" +
        "examId=" + examId +
        ", examName=" + examName +
        ", score=" + score +
        "}";
    }
}
