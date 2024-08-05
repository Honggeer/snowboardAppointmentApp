package com.example.snowboardlecapp.dao;

import ca.geer.Application;
import ca.geer.dao.UserDao;
import ca.geer.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class UserDaoTest {
    @Autowired
    UserDao userDao;
    @Test
    public void testInsert(){
        User user=new User();
        user.setUserName("Geer");
        user.setPassword("123123");
        user.setUserType(1);
        userDao.insertUser(user);
    }
    @Test
    public void testQueryUserByPwd(){
        User user1=userDao.queryUserByUserNameAndPwd("Geer","123123");
        System.out.println(user1.getUserId());
    }
    @Test
    public void testUpdate(){
        userDao.updateUser(1L,"Geer","123123","333333");
    }
}
