package com.cybersoft.demo.Bai3.controller;

import com.cybersoft.demo.Bai3.service.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sum")
public class SumController {
    @Autowired
    private SumService sumService;
    @GetMapping
    public int sum(@RequestParam int a, @RequestParam int b) {
        return sumService.sum(a, b);
    }
}
