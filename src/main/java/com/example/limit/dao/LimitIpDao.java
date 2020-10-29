package com.example.limit.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LimitIpDao {

    /** 将 ip加入黑名单 */
    boolean insertIp(String ip);

    /** 核对 ip */
    boolean selectIp(String ip);

    /** 解除 ip */
    boolean deleteIp(String ip);


}
