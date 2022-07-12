package com.jachs.mybatis.dynamic.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("player")
public class PlayerEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "pID", type = IdType.AUTO)
    private Long pID;

    @TableField("level")
    private Integer level;

    @TableField("playerUserName")
    private String playerUserName;


}
