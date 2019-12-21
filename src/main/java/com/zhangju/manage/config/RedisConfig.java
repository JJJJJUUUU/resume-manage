package com.zhangju.manage.config;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * redis模板
 * @author zhangju
 * @version 1.0
 * @since 1.0
 * 2019/1/17 16:06
 **/
@Configuration
public class RedisConfig extends CachingConfigurerSupport {

	@Bean
	public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory) {

		final StringRedisTemplate redisTemplate = new StringRedisTemplate(factory);
		return redisTemplate;
	}

}
