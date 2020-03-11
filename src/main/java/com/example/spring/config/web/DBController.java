package com.example.spring.config.web;

import com.example.spring.config.config.DBConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBController {
    @Autowired
    private DBConfig config;

    @GetMapping("/config")
    public String config(){
        config.confige();
        return "hellohttps";
    }
}
