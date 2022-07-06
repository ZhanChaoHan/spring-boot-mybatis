package com.jachs.mybatis.multiple.d2.service.impl;

import com.jachs.mybatis.multiple.d2.domain.Student;
import com.jachs.mybatis.multiple.d2.mapper.StudentMapper;
import com.jachs.mybatis.multiple.d2.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhanchaohan
 * @since 2022-07-06
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
