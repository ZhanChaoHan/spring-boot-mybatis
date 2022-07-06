package com.github.yulichang.join.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@Accessors(chain = true)
@EqualsAndHashCode
@TableName("user_address")
public class UserAddressDO {

    @TableId
    private Integer id;

    private Integer userId;

    private Integer areaId;

    private String tel;

    private String address;

    @TableLogic
    private Boolean del;
}
