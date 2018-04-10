package com.example.sy.spring.cloud.demo.springclouddemofacade.entity;

import com.example.sy.spring.cloud.demo.springclouddemocommon.entity.BaseEntity;

import javax.persistence.Table;

@Table(name = "demo")
public class Demo extends BaseEntity {

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
