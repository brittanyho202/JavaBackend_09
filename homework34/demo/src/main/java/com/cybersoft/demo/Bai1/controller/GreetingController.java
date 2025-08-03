package com.cybersoft.demo.Bai1.controller;

import com.cybersoft.demo.Bai1.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingController {
    @Autowired
    private GreetingService greetingService;
    @GetMapping
    ResponseEntity<?> greet(@RequestParam String name) {
        return ResponseEntity.ok(greetingService.sayHello(name));
    }
}
