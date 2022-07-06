package com.github.yulichang.mapping.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@Accessors(chain = true)
@TableName("user_address")
public class UserAddressDO {

    @TableId
    private Integer id;
    private Integer userId;
    private String tel;
    private String address;
    @TableLogic
    private Boolean del;

}
