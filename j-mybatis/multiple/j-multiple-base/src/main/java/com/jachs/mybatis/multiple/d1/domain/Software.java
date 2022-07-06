package com.jachs.mybatis.multiple.d1.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
public class Software extends Model<Software> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "${field.annotationColumnName}", type = IdType.AUTO)
    private String softWareId;

    @TableField("${field.annotationColumnName}")
    private String softWareName;

    @TableField("${field.annotationColumnName}")
    private String cFKId;


    public String getSoftWareId() {
        return softWareId;
    }

    public void setSoftWareId(String softWareId) {
        this.softWareId = softWareId;
    }

    public String getSoftWareName() {
        return softWareName;
    }

    public void setSoftWareName(String softWareName) {
        this.softWareName = softWareName;
    }

    public String getcFKId() {
        return cFKId;
    }

    public void setcFKId(String cFKId) {
        this.cFKId = cFKId;
    }

    @Override
	public Serializable pkVal() {
        return this.softWareId;
    }

    @Override
    public String toString() {
        return "Software{" +
        "softWareId=" + softWareId +
        ", softWareName=" + softWareName +
        ", cFKId=" + cFKId +
        "}";
    }
}
