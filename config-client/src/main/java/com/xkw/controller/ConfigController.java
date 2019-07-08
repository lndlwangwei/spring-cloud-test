package com.xkw.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangwei
 * @since 1.0
 */
@RestController
@RequestMapping("/test")
public class ConfigController {

    @Value("${name}")
    private String name;

    @Value("${bucket}")
    private String bucket;

    @Value("${url}")
    private String url;

    @GetMapping
    public String testGetName() {
        System.out.println(name);
        return name;
    }
}
