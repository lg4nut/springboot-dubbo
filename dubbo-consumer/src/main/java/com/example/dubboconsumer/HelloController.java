package com.example.dubboconsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.company.HelloService;

@RestController
public class HelloController {
    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        String hello = helloService.sayHello("world");
        System.out.println(helloService.sayHello("SnailClimb"));
        return hello;
    }
}
