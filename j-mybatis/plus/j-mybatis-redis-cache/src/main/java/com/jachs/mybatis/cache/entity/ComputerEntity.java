package com.jachs.mybatis.cache.entity;

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
 * @since 2022-07-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("computer")
public class ComputerEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("computerId")
    private String computerId;

    @TableField("computerName")
    private String computerName;

    @TableField("computerPrice")
    private Long computerPrice;

    @TableField("madeTime")
    private LocalDateTime madeTime;


}
