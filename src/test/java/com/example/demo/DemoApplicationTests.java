package com.example.demo;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        User u = new User();
        u.setUsername("张三");
        u.setPassword("123456");
        userService.insertUser(u);
    }

}
