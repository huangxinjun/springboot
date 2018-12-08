package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    //使用MockBean是因为此时容器中没有UserMapper这个对象
	@Autowired
    public UserDao userDao;

	@Test
    public void addUser() throws Exception {
        Assert.assertEquals(Integer.valueOf(1),userDao.addUser());
    }
}