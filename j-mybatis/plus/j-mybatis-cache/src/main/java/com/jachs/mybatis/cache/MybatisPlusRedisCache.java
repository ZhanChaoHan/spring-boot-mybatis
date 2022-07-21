package com.jachs.mybatis.cache;


import java.time.Duration;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.apache.ibatis.cache.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;


/***
 * 
 * @author zhanchaohan
 *
 */
public class MybatisPlusRedisCache implements Cache{
	// 读写锁
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock(true);
 
    private RedisTemplate<String, Object> redisTemplate;
 
    private String id;
 
    private Integer timeout;
    
    public MybatisPlusRedisCache(final String id) {
        if (id == null) {
            throw new IllegalArgumentException("Cache instances require an ID");
        }
        this.id = id;
        redisTemplate= (RedisTemplate<String, Object>) ApplicationContextUtils.getBean("redisTemplate");
    }
 
    @Override
    public String getId() {
        return this.id;
    }
 
    @Override
    public void putObject(Object key, Object value) {
        if (value != null) {
            redisTemplate.opsForHash().put(id, key.toString(), value);
            
            if (timeout != null && redisTemplate.opsForValue().getOperations().getExpire(id) == -1) {
            	System.out.println("设置超时:"+redisTemplate.expire(id, Duration.ofMillis(timeout)));
            }
        }
    }
 
    @Override
    public Object getObject(Object key) {
        try {
            if (key != null) {
            	System.out.println(redisTemplate.opsForHash().get(id, key.toString()));
                return redisTemplate.opsForHash().get(id, key.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
 
    @Override
    public Object removeObject(Object key) {
        if (key != null) {
            redisTemplate.delete(key.toString());
        }
        return null;
    }
 
    @Override
    public void clear() {
        //清空缓存
        redisTemplate.delete(id.toString());
    }
 
    @Override
    public int getSize() {
        Long size = redisTemplate.opsForHash().size(id.toString());
        return size.intValue();
    }
 
    @Override
    public ReadWriteLock getReadWriteLock() {
        return this.readWriteLock;
    }
 


}
