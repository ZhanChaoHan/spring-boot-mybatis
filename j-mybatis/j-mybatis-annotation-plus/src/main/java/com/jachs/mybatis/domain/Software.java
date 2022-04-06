package com.jachs.mybatis.domain;

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
 * @since 2022-04-06
 */
public class Software extends Model<Software> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "softWareId", type = IdType.AUTO)
    private String softwareid;

    @TableField("softWareName")
    private String softwarename;

    @TableField("cFKId")
    private String cfkid;


    public String getSoftwareid() {
        return softwareid;
    }

    public void setSoftwareid(String softwareid) {
        this.softwareid = softwareid;
    }

    public String getSoftwarename() {
        return softwarename;
    }

    public void setSoftwarename(String softwarename) {
        this.softwarename = softwarename;
    }

    public String getCfkid() {
        return cfkid;
    }

    public void setCfkid(String cfkid) {
        this.cfkid = cfkid;
    }

    @Override
    protected Serializable pkVal() {
        return this.softwareid;
    }

    @Override
    public String toString() {
        return "Software{" +
        "softwareid=" + softwareid +
        ", softwarename=" + softwarename +
        ", cfkid=" + cfkid +
        "}";
    }
}
