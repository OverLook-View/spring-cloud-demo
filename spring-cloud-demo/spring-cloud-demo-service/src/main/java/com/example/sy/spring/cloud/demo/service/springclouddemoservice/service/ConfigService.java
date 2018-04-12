package com.example.sy.spring.cloud.demo.service.springclouddemoservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
@RequestMapping("config")
public class ConfigService {
    @Value("${foo:config server not found}")
    private String foo;

    @RequestMapping("getFoo")
    public String getFoo(){
        return foo;
    }
}
