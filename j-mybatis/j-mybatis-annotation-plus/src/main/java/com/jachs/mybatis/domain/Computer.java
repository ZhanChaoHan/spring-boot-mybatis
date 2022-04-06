package com.jachs.mybatis.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhanchaohan
 * @since 2022-04-06
 */
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


    public String getComputerid() {
        return computerid;
    }

    public void setComputerid(String computerid) {
        this.computerid = computerid;
    }

    public String getComputername() {
        return computername;
    }

    public void setComputername(String computername) {
        this.computername = computername;
    }

    public Long getComputerprice() {
        return computerprice;
    }

    public void setComputerprice(Long computerprice) {
        this.computerprice = computerprice;
    }

    public Date getMadetime() {
        return madetime;
    }

    public void setMadetime(Date madetime) {
        this.madetime = madetime;
    }

    @Override
    protected Serializable pkVal() {
        return this.computerid;
    }

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
