package io.log.extension.agent.demo.dubbo.consumer.service;

import org.springframework.stereotype.Service;

import io.log.extension.agent.demo.api.UserService;

import com.alibaba.dubbo.config.annotation.Reference;

//@Service
public class ConsumerService {
//	@Reference(url="dubbo://127.0.0.1:20880", lazy=true)
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void testA() {
		
		for (int i = 0; i < 3; i++) {
			userService.findAll();			
		}

	}
}
