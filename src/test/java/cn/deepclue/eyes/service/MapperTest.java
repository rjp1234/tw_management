package cn.deepclue.eyes.service;

import cn.deepclue.eyes.mapper.cas.UserMapper;
import cn.deepclue.eyes.mapper.management.ManagementMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperTest {
    @Autowired
    UserMapper userMapper;

    @Autowired
    ManagementMapper managementMapper;

    @Test
    public void testDBConfig() {
        System.out.println(managementMapper.getVoteCount());
        System.out.println(userMapper.getCasUser());
    }
}
