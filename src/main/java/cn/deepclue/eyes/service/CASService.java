package cn.deepclue.eyes.service;

import cn.deepclue.eyes.domain.po.cas.User;

public interface CASService {

    User getUserById(String id);

    void addUser(User user);

    void deleteUserById(String id, String deleteUser);

    void updateNameById(String id, String name, String updateUser);
}
