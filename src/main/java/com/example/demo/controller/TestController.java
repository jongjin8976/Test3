package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	@GetMapping("/")
	public String index() {
		System.out.println("강의실에서 작업함!!!");
		return "index";
	}
}
