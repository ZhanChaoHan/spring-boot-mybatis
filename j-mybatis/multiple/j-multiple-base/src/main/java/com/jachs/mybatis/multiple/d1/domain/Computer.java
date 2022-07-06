package com.jachs.mybatis.multiple.d1.domain;

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
 * @since 2022-07-06
 */
public class Computer extends Model<Computer> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "${field.annotationColumnName}", type = IdType.AUTO)
    private String computerId;

    @TableField("${field.annotationColumnName}")
    private String computerName;

    @TableField("${field.annotationColumnName}")
    private Long computerPrice;

    @TableField("${field.annotationColumnName}")
    private Date madeTime;


    public String getComputerId() {
        return computerId;
    }

    public void setComputerId(String computerId) {
        this.computerId = computerId;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public Long getComputerPrice() {
        return computerPrice;
    }

    public void setComputerPrice(Long computerPrice) {
        this.computerPrice = computerPrice;
    }

    public Date getMadeTime() {
        return madeTime;
    }

    public void setMadeTime(Date madeTime) {
        this.madeTime = madeTime;
    }

    @Override
	public Serializable pkVal() {
        return this.computerId;
    }

    @Override
    public String toString() {
        return "Computer{" +
        "computerId=" + computerId +
        ", computerName=" + computerName +
        ", computerPrice=" + computerPrice +
        ", madeTime=" + madeTime +
        "}";
    }
}
