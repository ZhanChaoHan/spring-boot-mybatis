package com.github.yulichang.join.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.github.yulichang.join.enums.Sex;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@Accessors(chain = true)
@EqualsAndHashCode
@TableName("`user`")
public class UserDO {

    @TableId
    private Integer id;

    private String name;

    private Sex sex;

    private String headImg;

    @TableLogic
    private Boolean del;
}
