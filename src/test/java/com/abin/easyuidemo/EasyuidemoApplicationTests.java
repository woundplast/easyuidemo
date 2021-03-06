package com.abin.easyuidemo;

import com.abin.easyuidemo.dao.UserDao;
import com.abin.easyuidemo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EasyuidemoApplicationTests extends TmallApplicationTests {

    @Autowired
    UserDao userMapper;

    @Test
    public void contextLoads() {
        User user = userMapper.selectByPrimaryKey(12);
        System.out.println("----");


        System.out.println(user);
    }

}
