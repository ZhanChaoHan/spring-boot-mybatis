package com.baomidou.mybatisplus.samples.wrapper.entity;

import lombok.Data;

/**
 * @author miemie
 * @since 2018-08-10
 */
@Data
public class User {
    /**
     * 主键ID
     */
    private Long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 角色ID
     */
    private Long roleId;
}
