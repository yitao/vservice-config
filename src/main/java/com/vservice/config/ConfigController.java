package com.vservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yitao on 2019/1/24.
 */
@RestController
@RequestMapping("/config")
public class ConfigController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/port")
    public String port() {
        return port;
    }

}