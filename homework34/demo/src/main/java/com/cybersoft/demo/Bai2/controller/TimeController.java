package com.cybersoft.demo.Bai2.controller;

import com.cybersoft.demo.Bai2.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/time")
public class TimeController {
    @Autowired
    private TimeService timeService;
    @GetMapping
    public LocalDateTime getTime() {
        return timeService.getCurrentTime();
    }

}
