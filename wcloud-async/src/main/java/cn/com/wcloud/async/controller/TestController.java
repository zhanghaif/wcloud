package cn.com.wcloud.async.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.wcloud.async.entity.User;
import cn.com.wcloud.async.mapper.UserMapper;
@RestController
public class TestController {

	@Autowired
	private UserMapper userMapper;
	
	@GetMapping("/test")
	public List<User> list(){
		return userMapper.list();
	}
	@GetMapping("/")
	public String get(){
		return "hello world!";
	}
}
