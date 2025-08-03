package com.cybersoft.demo.Bai2.config;

import com.cybersoft.demo.Bai2.service.TimeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    TimeService timeService() {
        return new TimeService();
    }
}
