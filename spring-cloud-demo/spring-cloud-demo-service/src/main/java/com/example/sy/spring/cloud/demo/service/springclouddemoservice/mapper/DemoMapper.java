package com.example.sy.spring.cloud.demo.service.springclouddemoservice.mapper;

import com.example.sy.spring.cloud.demo.springclouddemofacade.entity.Demo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DemoMapper extends tk.mybatis.mapper.common.Mapper<Demo> {

    Demo selectDemo(@Param("id") Integer id);
}
