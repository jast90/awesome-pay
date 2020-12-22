package io.github.jast90.mybatis.config;

import io.github.jast90.mybatis.pagination.PageInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhiwen
 */
@Configuration
public class MybatisConfig {
    @Bean
    public PageInterceptor pageInterceptor() {
        return new PageInterceptor();
    }
}
