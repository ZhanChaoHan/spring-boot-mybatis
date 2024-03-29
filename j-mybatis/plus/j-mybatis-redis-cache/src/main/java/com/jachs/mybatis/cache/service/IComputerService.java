package com.jachs.mybatis.cache.service;

import com.jachs.mybatis.cache.entity.ComputerEntity;
import com.jachs.mybatis.cache.entity.dto.CpDto;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhanchaohan
 * @since 2022-07-19
 */
public interface IComputerService extends IService<ComputerEntity> {

	List<CpDto> queryCpDto(String cpId);

}
