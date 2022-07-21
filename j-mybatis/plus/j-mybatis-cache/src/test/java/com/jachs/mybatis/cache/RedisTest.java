package com.jachs.mybatis.cache;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

/***
 * 
 * @author zhanchaohan
 *
 */
@SpringBootTest(classes = Application.class)
public class RedisTest {
	 @Autowired
	 @Qualifier("stringRedisTemplate")
	 private RedisTemplate redisTemplate;
	 
	 @Test
	 public void test1() {
		Set<String>keySet=redisTemplate.keys("*");
		keySet.forEach(key->{
			System.out.println(key);
		});
	 }
	 
	 @Test
	 public void test2() {
		Set<String>keySet=redisTemplate.keys("*");
		
		keySet.forEach(key->{
			System.out.println(redisTemplate.expire(key, Duration.ofMillis(3000)));
		});
	 }
}
