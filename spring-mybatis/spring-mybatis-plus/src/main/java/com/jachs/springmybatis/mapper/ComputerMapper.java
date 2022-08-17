package com.jachs.springmybatis.mapper;

import com.jachs.springmybatis.entity.ComputerEntity;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhanchaohan
 * @since 2022-08-17
 */
@Mapper
public interface ComputerMapper extends BaseMapper<ComputerEntity> {

}
