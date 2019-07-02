package cn.iwangwei.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String test() {
        String test = restTemplate.getForObject("http://micro-service2/test/1", String.class);
        System.out.println("ribbon : "+test);

        System.out.println("services : " + discoveryClient.getServices());

        return "ribbon : "+test;
    }
}
