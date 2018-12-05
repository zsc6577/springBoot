package com.zsc.springBoot.api.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zsc.springBoot.frame.norm.Result;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api/user")
@Api(description="用户模块")
public class UserController {
	
	
	@GetMapping("/1.0/sayHello")
	public Result sayHello() {
		Result result = new Result();
		return result;
	}
}
