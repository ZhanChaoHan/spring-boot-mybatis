package com.github.yulichang.mapping.service;

import com.github.yulichang.base.MPJBaseServiceImpl;
import com.github.yulichang.mapping.entity.UserDO;
import com.github.yulichang.mapping.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends MPJBaseServiceImpl<UserMapper, UserDO> implements UserService {
}
