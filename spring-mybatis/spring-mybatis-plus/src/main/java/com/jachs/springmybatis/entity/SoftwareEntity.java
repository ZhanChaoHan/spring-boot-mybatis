package com.jachs.springmybatis.entity;

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
 * @since 2022-08-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("software")
public class SoftwareEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("softWareId")
    private String softWareId;

    @TableField("softWareName")
    private String softWareName;

    @TableField("cFKId")
    private String cFKId;


}
