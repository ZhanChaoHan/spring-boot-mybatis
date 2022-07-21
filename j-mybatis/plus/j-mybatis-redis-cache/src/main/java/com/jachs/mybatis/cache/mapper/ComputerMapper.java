package com.jachs.mybatis.cache.mapper;

import com.jachs.mybatis.cache.entity.ComputerEntity;
import com.jachs.mybatis.cache.entity.dto.CpDto;

import java.util.List;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Property;

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
@CacheNamespace(implementation = org.mybatis.caches.redis.RedisCache.class ,properties = { @Property(name = "timeout", value = "3") })
public interface ComputerMapper extends BaseMapper<ComputerEntity> {

	List<CpDto> queryCpDto(@Param("cpId") String cpId);

}
