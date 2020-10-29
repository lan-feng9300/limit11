package com.example.limit.config;

import com.example.limit.interceptor.AccessLimitInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebConfig extends WebMvcConfigurationSupport {


    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        AccessLimitInterceptor rateLimitInterceptor = new AccessLimitInterceptor();

        //rateLimitInterceptor.setRateLimitService(rateLimitService);
        rateLimitInterceptor.setRedisTemplate(redisTemplate);

        registry.addInterceptor(rateLimitInterceptor).addPathPatterns("/**");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

    }

}
