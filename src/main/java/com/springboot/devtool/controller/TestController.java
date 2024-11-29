package com.springboot.devtool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/test")
	@ResponseBody
	public String Test(){
		int a=5;
		int b=10;
		int c=5;
		return "Testing /t sum of a and b is"+(a+b+c);
	}
}
