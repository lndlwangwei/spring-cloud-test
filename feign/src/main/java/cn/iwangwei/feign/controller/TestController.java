package cn.iwangwei.feign.controller;

import cn.iwangwei.feign.feign.FeignService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    FeignService2 service2;

    @GetMapping("/feign/test/{id}")
    public String test(@PathVariable String id) {
        return service2.test(id);
    }
}
