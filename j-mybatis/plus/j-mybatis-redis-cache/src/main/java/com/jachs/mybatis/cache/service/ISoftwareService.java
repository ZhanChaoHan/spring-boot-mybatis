package com.jachs.mybatis.cache.service;

import com.jachs.mybatis.cache.entity.SoftwareEntity;

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
public interface ISoftwareService extends IService<SoftwareEntity> {

	List<SoftwareEntity> findAllByXml();

	SoftwareEntity findById(String swId);

}
