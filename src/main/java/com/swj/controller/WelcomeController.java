package com.swj.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	@ResponseBody
	public String helloWorld() {
		return "hello world!";
	}

	@RequestMapping("/welcome")
	public String welcome(Map<String, Object> model) {
		model.put("message", "hello world!");
		return "welcome";
	}
}