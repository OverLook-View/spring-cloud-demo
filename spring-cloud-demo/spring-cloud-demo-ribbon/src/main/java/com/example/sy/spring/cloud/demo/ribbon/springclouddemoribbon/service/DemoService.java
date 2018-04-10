package com.example.sy.spring.cloud.demo.ribbon.springclouddemoribbon.service;

import com.example.sy.spring.cloud.demo.springclouddemofacade.entity.Demo;
import com.example.sy.spring.cloud.demo.springclouddemofacade.facade.DemoFacade;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class DemoService implements DemoFacade {

    @Autowired
    RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "selectDemoError")
    public Demo selectDemo(Integer id) {
        return restTemplate.getForObject("http://SERVICE-DEMO/demo/select?id=" + id, Demo.class);
    }

    public Demo selectDemoError(Integer id) {
        return null;
    }
}
