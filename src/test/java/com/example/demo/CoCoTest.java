package com.example.demo;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import com.example.demo.service.impl.UserServiceImpl;
import com.example.demo.test.JacocoCoverage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CoCoTest {
    @Autowired
    JacocoCoverage jacocoCoverage;
    @Test
    public  void   Coco() {
        jacocoCoverage.doSomeThing();
    }
}
