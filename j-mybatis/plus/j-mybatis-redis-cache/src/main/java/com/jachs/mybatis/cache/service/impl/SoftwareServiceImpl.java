package com.jachs.mybatis.cache.service.impl;

import com.jachs.mybatis.cache.entity.SoftwareEntity;
import com.jachs.mybatis.cache.mapper.SoftwareMapper;
import com.jachs.mybatis.cache.service.ISoftwareService;
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
public class SoftwareServiceImpl extends ServiceImpl<SoftwareMapper, SoftwareEntity> implements ISoftwareService {

	@Override
	public List<SoftwareEntity> findAllByXml() {
		return baseMapper.findAllByXml();
	}

	@Override
	public SoftwareEntity findById(String swId) {
		return baseMapper.findById(swId);
	}

}
