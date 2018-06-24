package cn.iwangwei.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test/{id}")
    public String test(@PathVariable String id) {
        return String.format("hello micro-service2 %s", id);
    }
}
