package com.cybersoft.demo.Bai5.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
    public String welcome(String lang, String username) {
        String greeting = "";
        if (lang.equals("vi")) {
            greeting =  "Xin chào, " + username;
        } else if (lang.equals("en")) {
            greeting =  "Hello, " + username;
        }
        return greeting;
    }
}