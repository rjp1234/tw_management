package cn.deepclue.eyes.service.impl;

import cn.deepclue.eyes.domain.po.cas.User;
import cn.deepclue.eyes.mapper.cas.UserMapper;
import cn.deepclue.eyes.service.CASService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CASServiceImpl implements CASService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(String id) {
        return userMapper.getUserById(id);
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public void deleteUserById(String id, String deleteUser) {
        userMapper.deleteUserById(id, new Date(System.currentTimeMillis()), deleteUser);
    }

    @Override
    public void updateNameById(String id, String name, String updateUser) {
        userMapper.updateNameById(id,name,new Date(System.currentTimeMillis()), updateUser);
    }
}
