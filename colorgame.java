package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class colorgame{
	private String Favcolour="Green";
	@GetMapping("/get")
	public String getMyFav() {
		return "My favourite colour is "+Favcolour;
	}
}