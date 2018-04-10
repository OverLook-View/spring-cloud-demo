package com.example.sy.spring.cloud.demo.feign.springclouddemofeign.service.hystric;

import com.example.sy.spring.cloud.demo.feign.springclouddemofeign.service.DemoService;
import com.example.sy.spring.cloud.demo.springclouddemofacade.entity.Demo;
import org.springframework.stereotype.Component;

@Component
public class DemoServiceHystric implements DemoService {
    @Override
    public Demo selectDemo(Integer id) {
        return null;
    }
}
