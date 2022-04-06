package com.jachs.mybatis.service.impl;

import com.jachs.mybatis.domain.Computer;
import com.jachs.mybatis.mapper.ComputerMapper;
import com.jachs.mybatis.service.ComputerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhanchaohan
 * @since 2022-04-06
 */
@Service
public class ComputerServiceImpl extends ServiceImpl<ComputerMapper, Computer> implements ComputerService {

}
