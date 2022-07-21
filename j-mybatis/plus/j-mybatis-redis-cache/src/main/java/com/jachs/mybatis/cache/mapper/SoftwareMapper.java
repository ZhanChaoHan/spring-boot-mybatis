package com.jachs.mybatis.cache.mapper;

import com.jachs.mybatis.cache.entity.SoftwareEntity;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
public interface SoftwareMapper extends BaseMapper<SoftwareEntity> {
	List<SoftwareEntity> findAllByXml();

	SoftwareEntity findById(@Param("swId") String swId);

}
