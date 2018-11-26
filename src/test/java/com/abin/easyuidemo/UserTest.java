package com.abin.easyuidemo;

import com.abin.easyuidemo.dao.UserDao;
import com.abin.easyuidemo.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserTest extends TmallApplicationTests {
    @Autowired
    UserDao userDao;

    @Test
    public void name() {
        User user = userDao.selectByPrimaryKey(12);
        System.out.println(user);

    }


}
