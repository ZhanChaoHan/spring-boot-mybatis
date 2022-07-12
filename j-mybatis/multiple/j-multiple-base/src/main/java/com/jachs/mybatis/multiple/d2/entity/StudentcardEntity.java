package com.jachs.mybatis.multiple.d2.entity;

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
@TableName("studentcard")
public class StudentcardEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("cardId")
    private String cardId;

    @TableField("cardMonery")
    private Long cardMonery;

    @TableField("cardName")
    private String cardName;

    @TableField("cardType")
    private String cardType;


}
