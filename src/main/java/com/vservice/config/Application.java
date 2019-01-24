package com.vservice.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * 应用启动类
 * Created by yitao on 2019/1/24.
 */
@SpringBootApplication
@EnableConfigServer
@RefreshScope
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
