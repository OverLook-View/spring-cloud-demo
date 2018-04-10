package com.example.sy.spring.cloud.demo.feign.springclouddemofeign.service;

import com.example.sy.spring.cloud.demo.feign.springclouddemofeign.service.hystric.DemoServiceHystric;
import com.example.sy.spring.cloud.demo.springclouddemofacade.entity.Demo;
import com.example.sy.spring.cloud.demo.springclouddemofacade.facade.DemoFacade;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "SERVICE-DEMO",fallback = DemoServiceHystric.class)
public interface DemoService extends DemoFacade {

    @RequestMapping(value = "/demo/select",method = RequestMethod.GET)
    Demo selectDemo(@RequestParam("id") Integer id);
}
