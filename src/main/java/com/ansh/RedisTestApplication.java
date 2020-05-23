package com.ansh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.*;

@SpringBootApplication
public class RedisTestApplication implements CommandLineRunner {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;


	public static void main(String[] args) {
		SpringApplication.run(RedisTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ZSetOperations<String, String> zSetOperations = stringRedisTemplate.opsForZSet();
		zSetOperations.add("JK", "One Hundred", 100);
		zSetOperations.add("JK", "Four Hundred", 400);
		zSetOperations.add("JK", "Two Thousand", 2000);
		zSetOperations.add("JK", "Ten Thousand", 10000);
	}
}
