package com.bridgelabz.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/web")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/web/message")
	public String message(Model model) {
		model.addAttribute("Message","This is Custome Message");
		return "message";
	}
}
