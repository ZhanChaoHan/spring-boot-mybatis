package com.jachs.mybatis.multiple.d2.service.impl;

import com.jachs.mybatis.multiple.d2.entity.StudentEntity;
import com.jachs.mybatis.multiple.d2.mapper.StudentMapper;
import com.jachs.mybatis.multiple.d2.service.IStudentService;
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
public class StudentServiceImpl extends ServiceImpl<StudentMapper, StudentEntity> implements IStudentService {

}
