package com.example.demo.mapper;

import com.example.demo.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    UserMapper userMapper;
     @Test
     public void test(){
         User user = new User();
         user.setPhonenumber("1111");
         user.setUsername("1");
         user.setPassword("2");
         userMapper.insert(user);
     }
}