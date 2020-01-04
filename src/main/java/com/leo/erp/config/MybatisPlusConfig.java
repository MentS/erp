package com.leo.erp.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;

/**
 * @author SH
 * @date 2020/1/4
 */
public class MybatisPlusConfig {
    /**
     * 分页插件
     *
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
