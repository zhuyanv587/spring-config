package com.example.spring.config.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DvDBConfig implements DBConfig {
    @Override
    public void confige() {
        System.out.println("dev环境");
    }
}
