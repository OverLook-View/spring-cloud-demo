package com.example.sy.spring.cloud.demo.springclouddemocommon.entity;

import java.io.Serializable;


import javax.persistence.Transient;


public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -1449875354570226204L;
    //页码
    @Transient
    protected Integer pageNum;

    //每页条数
    @Transient
    protected Integer pageSize;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


}
