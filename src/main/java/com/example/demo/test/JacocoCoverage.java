package com.example.demo.test;

import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JacocoCoverage {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public static String name = "forTest";

	public static JacocoCoverage instance = new JacocoCoverage();

	/**
	 * 使用try catch捕获异常
	 */
	public void catchSomeThing() {
		try {
			System.out.println("你觉得我会抛错吗？");
			// throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("出异常了。");
			e.printStackTrace();
		}
	}

	/**
	 * 随便打印
	 */
	public void doSomeThing() {
		System.out.println("这是一个方法 名字叫doSomeThing");
		List<User> list = jdbcTemplate.query("select * from `user`", new Object[]{}, new BeanPropertyRowMapper(User.class));
		System.out.println(list.size());
	}

}

