package com.cybersoft.demo.Bai5.controller;


import com.cybersoft.demo.Bai5.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @Autowired
    private WelcomeService welcomeService;

    @GetMapping("{username}")
    public String welcome(@RequestParam String lang, @PathVariable String username) {
        return welcomeService.welcome(lang, username);
    }

}
