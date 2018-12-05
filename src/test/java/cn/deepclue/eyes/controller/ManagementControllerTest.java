package cn.deepclue.eyes.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ManagementControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void testMysqlTimezone() throws Exception {
        String ret = "{\"errno\":200,\"errmsg\":\"success\",\"data\":[{\"id\":3,\"topicName\":\"大选2\",\"volumeNum\":7431646,\"rankChange\":0,\"region\":\"tanzi_region_label\",\"type\":0,\"createTime\":\"2018-11-13 17:48:03\",\"statisticTime\":\"2018-11-13 17:10:34\",\"regionId\":1,\"regionName\":\"潭子区\"},{\"id\":1,\"topicName\":\"空气污染\",\"volumeNum\":2313123,\"rankChange\":0,\"region\":\"tanzi_region_label\",\"type\":0,\"createTime\":\"2018-11-12 17:23:40\",\"statisticTime\":\"2018-11-12 15:16:27\",\"regionId\":1,\"regionName\":\"潭子区\"}]}";
        mvc.perform(MockMvcRequestBuilders.get("/topic/statistics?date=1542058301&type=CHOICETOPIC"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(ret));
    }
}
