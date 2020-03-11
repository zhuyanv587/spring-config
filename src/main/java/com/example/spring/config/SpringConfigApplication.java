package com.example.spring.config;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringConfigApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringConfigApplication.class, args);

        new SpringApplicationBuilder(SpringConfigApplication.class)
                .bannerMode(Banner.Mode.OFF).run(args);
    }

}
