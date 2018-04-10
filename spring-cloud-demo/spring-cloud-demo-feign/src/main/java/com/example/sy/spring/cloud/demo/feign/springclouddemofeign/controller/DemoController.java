package com.example.sy.spring.cloud.demo.feign.springclouddemofeign.controller;

import com.example.sy.spring.cloud.demo.feign.springclouddemofeign.service.DemoService;
import com.example.sy.spring.cloud.demo.springclouddemofacade.entity.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("select")
    public Demo select(Integer id) {
        return demoService.selectDemo(id);
    }
}
