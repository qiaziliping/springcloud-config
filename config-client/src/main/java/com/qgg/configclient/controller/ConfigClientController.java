package com.qgg.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope // 只有添加了该注释，才会在不重启的服务的情况下更新配置
public class ConfigClientController {


    @Value("${qia}")
    private String value;


    @GetMapping("/getName/{name}")
    public String getName(@PathVariable String name) {
        return name+"---"+value;
    }

}
