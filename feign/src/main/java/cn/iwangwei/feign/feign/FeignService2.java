package cn.iwangwei.feign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("micro-service2")
public interface FeignService2 {

//    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @GetMapping(value = "/test/{id}")
    String test(@PathVariable("id") String id);
}
