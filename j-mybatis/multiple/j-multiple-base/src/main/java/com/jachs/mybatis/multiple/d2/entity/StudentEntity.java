package com.jachs.mybatis.multiple.d2.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
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
@TableName("student")
public class StudentEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("studentId")
    private String studentId;

    @TableField("dateOfBirth")
    private LocalDateTime dateOfBirth;

    @TableField("studentAge")
    private Integer studentAge;

    @TableField("studentName")
    private String studentName;

    @TableField("sCarId")
    private String sCarId;


}
