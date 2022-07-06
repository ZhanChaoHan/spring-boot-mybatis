package com.github.yulichang.mapping;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.yulichang.mapping.entity.UserDO;
import com.github.yulichang.mapping.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * 一对一，一对多关系映射查询
 * 映射只对UserMapper中的方法有效果 ，一般以Deep结尾，比如 selectByIdDeep selectListDeep 等
 * 如果不需要关系映射就使用mybatis plus原生方法即可，比如 selectById selectList 等
 *
 * @see com.github.yulichang.base.service.MPJDeepService
 */
@SpringBootTest
class MappingTest {
    @Resource
    private UserMapper userMapper;

    /**
     * 根据id查询
     * <p>
     * 查询过程：
     * 一共查询了3次
     * 第一次查询目标UserDO
     * 第二次根据pid查询上级用户
     * 第三次根据自身id查询下级用户
     *
     * @see UserDO
     */
    @Test
    void test1() {
        UserDO deep = userMapper.selectByIdDeep(2);
        System.out.println(deep);
    }

    /**
     * 查询全部
     * <p>
     * 查询过程：
     * 一共查询了3次
     * 第一次查询目标UserDO集合
     * 第二次根据pid查询上级用户（不会一条记录一条记录的去查询，对pid进行汇总，用in语句一次性查出来，然后进行匹配）
     * 第三次根据自身id查询下级用户（不会一条记录一条记录的去查询，对id进行汇总，用in语句一次性查出来，然后进行匹配）
     *
     * @see UserDO
     */
    @Test
    void test2() {
        List<UserDO> list = userMapper.selectListDeep(Wrappers.emptyWrapper());
        list.forEach(System.out::println);
    }

    /**
     * 分页查询
     * <p>
     * 查询过程与上面一致
     */
    @Test
    void test3() {
        Page<UserDO> page = userMapper.selectPageDeep(new Page<>(2, 2), Wrappers.emptyWrapper());
        page.getRecords().forEach(System.out::println);
    }


}
