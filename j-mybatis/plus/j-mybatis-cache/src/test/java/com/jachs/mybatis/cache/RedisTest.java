package com.jachs.mybatis.cache;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * 
 * @author zhanchaohan
 *
 */
@SpringBootTest(classes = Application.class)
public class RedisTest {
	@Autowired
	private RedisTemplate<Object, Object> redisTemplate;
	
	private String id="com.jachs.mybatis.cache.mapper.ComputerMapper";
	
	@Test
	public void test1() {
//		redisTemplate.opsForHash().get(id, key.toString());
		
//		Object obj=redisTemplate.opsForValue().get(id);
//		
//		System.out.println(obj);
	}
}
