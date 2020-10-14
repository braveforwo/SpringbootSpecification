package com.example.demo.controller;

import com.example.demo.domain.ResultVO;
import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorld {
    @Autowired
    UserService userService;
    @ResponseBody
    @RequestMapping("/hello")
    public User hello(){
         User u = new User();
         u.setUsername("张三");
         u.setPassword("123456");
         userService.insertUser(u);
         return u;
     }
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        int i = 10/0;
        return "adf";
    }
}
