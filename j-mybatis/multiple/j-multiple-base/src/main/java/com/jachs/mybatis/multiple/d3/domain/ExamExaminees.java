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
public class ExamExaminees extends Model<ExamExaminees> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "${field.annotationColumnName}", type = IdType.AUTO)
    private Integer examExamid;

    @TableField("${field.annotationColumnName}")
    private Integer examineesExamineeid;


    public Integer getExamExamid() {
        return examExamid;
    }

    public void setExamExamid(Integer examExamid) {
        this.examExamid = examExamid;
    }

    public Integer getExamineesExamineeid() {
        return examineesExamineeid;
    }

    public void setExamineesExamineeid(Integer examineesExamineeid) {
        this.examineesExamineeid = examineesExamineeid;
    }

    @Override
	public Serializable pkVal() {
        return this.examExamid;
    }

    @Override
    public String toString() {
        return "ExamExaminees{" +
        "examExamid=" + examExamid +
        ", examineesExamineeid=" + examineesExamineeid +
        "}";
    }
}
