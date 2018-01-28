package com.blogger.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * 类备注：spring-boot Application
 *
 * @author Administrator
 * @version 1.0
 * @date 2018-01-27 22:52
 * @desc
 * @since 1.8
 */

@SpringBootApplication
// 启用事物管理
@EnableTransactionManagement
public class BbsDemo extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BbsDemo.class);
    }

    @Bean
    public PlatformTransactionManager txManager(DataSource dataSource) {

        return new DataSourceTransactionManager(dataSource);
    }

    public static void main(String[] args) {

        SpringApplication.run(BbsDemo.class, args);
    }
}
