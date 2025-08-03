package com.cybersoft.demo.Bai1.service;

import org.springframework.stereotype.Service;

@Service // or @Component
public class GreetingService {
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}
