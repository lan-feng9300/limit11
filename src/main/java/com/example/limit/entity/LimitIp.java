package com.example.limit.entity;

import java.io.Serializable;

/**
 * (TLimitIp)实体类
 *
 * @author makejava
 * @since 2020-10-30 06:30:13
 */
public class LimitIp implements Serializable {
    private static final long serialVersionUID = 139786979467858915L;
    
    private Integer id;
    
    private String ip;
    
    private Long creatTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Long getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Long creatTime) {
        this.creatTime = creatTime;
    }

}