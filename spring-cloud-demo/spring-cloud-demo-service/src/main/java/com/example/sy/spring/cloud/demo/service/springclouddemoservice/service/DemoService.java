package com.example.sy.spring.cloud.demo.service.springclouddemoservice.service;

import com.example.sy.spring.cloud.demo.service.springclouddemoservice.mapper.DemoMapper;
import com.example.sy.spring.cloud.demo.springclouddemofacade.entity.Demo;
import com.example.sy.spring.cloud.demo.springclouddemofacade.facade.DemoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
@Service
public class DemoService /*extends BaseService<Demo>*/ implements DemoFacade{
    @Autowired
    private DemoMapper demoMapper;

    @Override
    @RequestMapping("select")
    public Demo selectDemo(Integer id) {
        return demoMapper.selectDemo(id);
    }
}
