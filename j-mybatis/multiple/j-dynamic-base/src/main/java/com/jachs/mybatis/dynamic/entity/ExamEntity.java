package com.jachs.mybatis.dynamic.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhanchaohan
 * @since 2022-07-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("exam")
public class ExamEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("examId")
    private Integer examId;

    @TableField("examName")
    private String examName;

    @TableField("score")
    private Object score;


}
