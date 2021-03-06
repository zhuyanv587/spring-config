package com.example.spring.config.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Component
@ConfigurationProperties(prefix = "book")
public class Book {
    private String isdn;
    private String name;
    private String author;
    private Float price;
//    @Value(value = "${book.description}")
    private String description;

    private List<String> fans;
    private Map<String, Integer> rands;
}
