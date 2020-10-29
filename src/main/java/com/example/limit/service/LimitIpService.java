package com.example.limit.service;

/**
 * (TLimitIp)表服务接口
 *
 * @author makejava
 * @since 2020-10-30 06:30:14
 */
public interface LimitIpService {

    /** 将 ip加入黑名单 */
    boolean saveIp(String ip);

    /** 核对 ip */
    boolean checkIp(String ip);

    /** 解除 ip */
    boolean deleteIp(String ip);

}