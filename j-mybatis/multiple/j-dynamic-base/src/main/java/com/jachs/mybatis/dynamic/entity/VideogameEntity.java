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
@TableName("videogame")
public class VideogameEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "gameId", type = IdType.AUTO)
    private Long gameId;

    @TableField("gameName")
    private String gameName;

    @TableField("gamePrice")
    private Integer gamePrice;

    @TableField("pID")
    private Long pID;


}
