package cn.deepclue.eyes.service;

import cn.deepclue.eyes.domain.po.cas.User;

public interface ManagementService {
    User getCasUserById(String id);
}
