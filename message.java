package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class message {
	@GetMapping("/msg")
	public String msg() {
		return "welcome messsage";
	}
}