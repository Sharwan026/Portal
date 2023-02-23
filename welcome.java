package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class welcome {
	@RequestMapping("/")
	public String Welcome() {
		return "Welcome String Boot!";
	}	
}
