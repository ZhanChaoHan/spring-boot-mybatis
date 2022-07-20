package com.jachs.mybatis.cache;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * redis 配置
 */
@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {
//	@Value("${spring.redis.host}")
//	private String redisHost;
//
//	@Value("${spring.redis.port}")
//	private int redisPort;
//
//	@Value("${spring.redis.timeout}")
//	private int redisTimeout;
//
//	@Value("${spring.redis.password}")
//	private String redisAuth;
//
//	@Value("${spring.redis.database}")
//	private int redisDb;
//
//	@Value("${spring.redis.jedis.pool.max-active}")
//	private int maxActive;
//
//	@Value("${spring.redis.jedis.pool.max-wait}")
//	private int maxWait;
//
//	@Value("${spring.redis.jedis.pool.max-idle}")
//	private int maxIdle;
//
//	@Value("${spring.redis.jedis.pool.min-idle}")
//	private int minIdle;
//
//	public RedisConnectionFactory connection() {
//		 JedisPoolConfig poolConfig = new JedisPoolConfig();
//		    poolConfig.setMaxTotal(maxActive);
//		    poolConfig.setMaxIdle(maxIdle);
//		    poolConfig.setMaxWaitMillis(maxWait);
//		    poolConfig.setMinIdle(minIdle);
//		    poolConfig.setTestOnBorrow(true);
//		    poolConfig.setTestOnReturn(false);
//		    poolConfig.setTestWhileIdle(true);
//		    JedisClientConfiguration clientConfig = JedisClientConfiguration.builder()
//		            .usePooling().poolConfig(poolConfig).and().readTimeout(Duration.ofMillis(redisTimeout)).build();
//	
//		 // 单点redis
//		    RedisStandaloneConfiguration redisConfig = new RedisStandaloneConfiguration();
//		    // 哨兵redis
//		    // RedisSentinelConfiguration redisConfig = new RedisSentinelConfiguration();
//		    // 集群redis
//		    // RedisClusterConfiguration redisConfig = new RedisClusterConfiguration();
//		    redisConfig.setHostName(redisHost);
//		    redisConfig.setPassword(RedisPassword.of(redisAuth));
//		    redisConfig.setPort(redisPort);
//		    redisConfig.setDatabase(redisDb);
//			
//		    JedisConnectionFactory(redisConfig,clientConfig);
//	}
    /**
     * 设置 redisTemplate 序列化方式
     *
     * @param factory
     * @return
     */
//    @Bean
//    public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory factory) {
//        RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<Object, Object>();
//        Jackson2JsonRedisSerializer serializer = new Jackson2JsonRedisSerializer(Object.class);
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
//        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//        serializer.setObjectMapper(mapper);
//        //使用StringRedisSerializer来序列化和反序列化redis的key值
//        redisTemplate.setKeySerializer(new StringRedisSerializer());
//        redisTemplate.setValueSerializer(serializer);
//        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
//        redisTemplate.setHashValueSerializer(serializer);
//        redisTemplate.afterPropertiesSet();
//        
//        redisTemplate.setConnectionFactory(factory);
//        return redisTemplate;
//    }

}
