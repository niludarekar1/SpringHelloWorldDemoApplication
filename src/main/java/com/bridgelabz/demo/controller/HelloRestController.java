package com.bridgelabz.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
 @RequestMapping("/")
 
  public String myIndex() {
	 
	 return "Hello from Bridelabz ";

 }
}
