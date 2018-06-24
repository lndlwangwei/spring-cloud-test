package cn.iwangwei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/test")
    public String test() {
//        String response = restTemplate.getForObject("http://localhost:8082/test", String.class);
        String response = restTemplate.getForObject("http://micro-service2:8082/test", String.class);

        System.out.println(response);
        return "test service1";
    }
}
