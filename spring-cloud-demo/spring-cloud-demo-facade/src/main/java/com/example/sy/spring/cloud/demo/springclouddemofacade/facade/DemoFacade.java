package com.example.sy.spring.cloud.demo.springclouddemofacade.facade;


import com.example.sy.spring.cloud.demo.springclouddemocommon.facade.BaseFacade;
import com.example.sy.spring.cloud.demo.springclouddemofacade.entity.Demo;

public interface DemoFacade /*extends BaseFacade<Demo>*/ {
    Demo selectDemo(Integer id);
}
