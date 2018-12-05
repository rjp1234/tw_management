package cn.deepclue.eyes.service.impl;

import cn.deepclue.eyes.domain.po.cas.User;
import cn.deepclue.eyes.service.CASService;
import cn.deepclue.eyes.service.ManagementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagementServiceImpl implements ManagementService {
    private static Logger logger = LoggerFactory.getLogger(ManagementServiceImpl.class);

    @Autowired
    CASService casService;

    @Override
    public User getCasUserById(String id) {
        logger.info("Get User " + id);
        return casService.getUserById(id);
    }
}
