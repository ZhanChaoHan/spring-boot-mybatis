package com.jachs.mybatis.dynamic.service.impl;

import com.jachs.mybatis.dynamic.entity.PlayerEntity;
import com.jachs.mybatis.dynamic.mapper.PlayerMapper;
import com.jachs.mybatis.dynamic.service.IPlayerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhanchaohan
 * @since 2022-07-12
 */
@Service
public class PlayerServiceImpl extends ServiceImpl<PlayerMapper, PlayerEntity> implements IPlayerService {

}
