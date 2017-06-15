package com.testSSM.test.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testSSM.test.model.User;
import com.testSSM.test.service.TestService;

@Controller
@RequestMapping("/test")
public class TestController {

	@Resource
	private TestService testService;

	@RequestMapping("/user")
	public String test(Model model){
		User user = testService.queryTest("11");
		model.addAttribute("user", user);
		return "showUser";
	}
}
