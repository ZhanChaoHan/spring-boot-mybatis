package com.github.yulichang.mapping.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.enums.SqlKeyword;
import com.github.yulichang.annotation.EntityMapping;
import com.github.yulichang.annotation.FieldMapping;
import com.github.yulichang.annotation.MPJMappingApply;
import com.github.yulichang.annotation.MPJMappingCondition;
import com.github.yulichang.mapping.enums.Sex;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@ToString
@Accessors(chain = true)
@TableName("`user`")
public class UserDO {

    @TableId
    private Integer id;
    private Integer parentId;
    private String name;
    private Sex sex;
    private String headImg;
    @TableLogic
    private Boolean del;

    /**
     * 查询上级 一对一
     */
    @TableField(exist = false)
    @EntityMapping(thisField = "parentId", joinField = "id")
    private UserDO pUser;

    /**
     * 查询下级 一对多
     */
    @TableField(exist = false)
    @EntityMapping(thisField = "id", joinField = "parentId")
    private List<UserDO> childUser;

    /**
     * 带条件的查询下级 一对多
     */
    @TableField(exist = false)
    @EntityMapping(thisField = "id", joinField = "parentId",
            condition = {
                    @MPJMappingCondition(column = "sex", value = "0"),//sex = '0' 默认条件是等于
                    @MPJMappingCondition(column = "name", value = "张三", keyWord = SqlKeyword.LIKE)},//name like '%a%'
            apply = @MPJMappingApply(value = "id between 1 and 20"))//拼接sql 同 wrapper.apply()
    private List<UserDO> childUserCondition;

    /**
     * 查询地址 (一对多)
     */
    @TableField(exist = false)
    @EntityMapping(thisField = "id", joinField = "userId")
    private List<UserAddressDO> addressList;

    /**
     * 绑定字段 （一对多）
     */
    @TableField(exist = false)
    @FieldMapping(tag = UserDO.class, thisField = "id", joinField = "parentId", select = "head_img")
    private List<Integer> childIds;
}
