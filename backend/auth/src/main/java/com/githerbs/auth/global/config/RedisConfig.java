package com.githerbs.auth.global.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisKeyValueAdapter;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@EnableRedisRepositories
@Configuration
@Slf4j
public class RedisConfig {

	private final RedisClusterNodes nodes;
	@Value("${redis.password}")
	private String password;
	@Value("${redis.master.host}")
	private String masterHost;
	@Value("${redis.master.port}")
	private int masterPort;

	/**
	 * redis 연결 설정
	 * */
	@Bean
	public RedisConnectionFactory redisConnectionFactory() {

		/*redis standalone을 구성한 경우*/
		String host = nodes.getMaster().getHost();
		int port = nodes.getMaster().getPort();
		if(nodes.getMaster().getHost() == null || nodes.getMaster().getHost().equals("")){
			log.debug("redis standalone master host null");
			host =  masterHost;
		}
		if(nodes.getMaster().getPort() != 6379) {
			log.debug("redis standalone master port null");
			port = masterPort;
		}
		RedisStandaloneConfiguration config = new RedisStandaloneConfiguration(host, port);
		config.setPassword(password);
		return new LettuceConnectionFactory(config);
	}

	@Bean
	public RedisSerializer<Object> springSessionDefaultRedisSerializer() {
		return new GenericJackson2JsonRedisSerializer();
	}

	@Bean
	public RedisTemplate<String, Object> redisTemplate(
		RedisConnectionFactory redisConnectionFactory,
		RedisSerializer<Object> springSessionDefaultRedisSerializer
	) {
		RedisTemplate<String, Object> template = new RedisTemplate<>();
		template.setConnectionFactory(redisConnectionFactory);
		template.setKeySerializer(new StringRedisSerializer());
		template.setValueSerializer(springSessionDefaultRedisSerializer);
		return template;
	}


}
