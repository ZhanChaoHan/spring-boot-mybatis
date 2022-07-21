package com.jachs.mybatis.cache.service.impl;

import com.jachs.mybatis.cache.entity.ComputerEntity;
import com.jachs.mybatis.cache.entity.dto.CpDto;
import com.jachs.mybatis.cache.mapper.ComputerMapper;
import com.jachs.mybatis.cache.service.IComputerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhanchaohan
 * @since 2022-07-19
 */
@Service
public class ComputerServiceImpl extends ServiceImpl<ComputerMapper, ComputerEntity> implements IComputerService {

	@Override
	public List<CpDto> queryCpDto(String cpId) {
		return baseMapper.queryCpDto(cpId);
	}

}
