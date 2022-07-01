package com.jachs.mybatis.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 *
 * @author zhanchaohan
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Computer extends Model<Computer> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "computerId", type = IdType.AUTO)
    private String computerid;

    @TableField("computerName")
    private String computername;

    @TableField("computerPrice")
    private Long computerprice;

    @TableField("madeTime")
    private Date madetime;


    @Override
    public String toString() {
        return "Computer{" +
        "computerid=" + computerid +
        ", computername=" + computername +
        ", computerprice=" + computerprice +
        ", madetime=" + madetime +
        "}";
    }
}
