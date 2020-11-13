package com.example.demo.mapper;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import com.example.demo.service.impl.UserServiceImpl;
import com.example.demo.test.JacocoCoverage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tk.mybatis.spring.annotation.MapperScan;

import static org.junit.Assert.*;
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