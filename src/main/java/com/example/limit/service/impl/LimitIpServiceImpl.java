package com.example.limit.service.impl;

import com.example.limit.entity.LimitIp;
import com.example.limit.dao.LimitIpDao;
import com.example.limit.service.LimitIpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TLimitIp)表服务实现类
 *
 * @author makejava
 * @since 2020-10-30 06:30:14
 */
@Service("tLimitIpService")
public class LimitIpServiceImpl implements LimitIpService {

    @Resource
    private LimitIpDao LimitIpDao;

    /**
     * 将 ip加入黑名单
     *
     * @param ip
     */
    @Override
    public boolean saveIp(String ip) {
        return false;
    }

    /**
     * 核对 ip
     *
     * @param ip
     */
    @Override
    public boolean checkIp(String ip) {

        return false;
    }

    /**
     * 解除 ip
     *
     * @param ip
     */
    @Override
    public boolean deleteIp(String ip) {

        return false;
    }

}