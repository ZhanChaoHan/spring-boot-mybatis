package com.jachs.mybatis.cache.mapper;

import com.jachs.mybatis.cache.MybatisPlusRedisCache;
import com.jachs.mybatis.cache.entity.ComputerEntity;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhanchaohan
 * @since 2022-07-19
 */
@Mapper
@CacheNamespace(implementation= MybatisPlusRedisCache.class,eviction=MybatisPlusRedisCache.class)
public interface ComputerMapper extends BaseMapper<ComputerEntity> {

}
