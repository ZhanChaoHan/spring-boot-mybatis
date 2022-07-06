package com.jachs.mybatis.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author zhanchaohan
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Software extends Model<Software> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "softWareId", type = IdType.AUTO)
    private String softwareid;

    @TableField("softWareName")
    private String softwarename;

    @TableField("cFKId")
    private String cfkid;


    @Override
    public String toString() {
        return "Software{" +
        "softwareid=" + softwareid +
        ", softwarename=" + softwarename +
        ", cfkid=" + cfkid +
        "}";
    }
}
