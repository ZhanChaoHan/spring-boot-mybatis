package com.jachs.mybatis.dynamic.mapper;

import com.jachs.mybatis.dynamic.entity.ComputerEntity;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *  没有@DS	默认数据源<br>
 *  @DS("dsName")	dsName可以为组名也可以为具体某个库的名称<br>
 * @author zhanchaohan
 * @since 2022-07-12
 */
@DS("d1")
@Mapper
public interface ComputerMapper extends BaseMapper<ComputerEntity> {

}
