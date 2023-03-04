package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class StudentProviderController {
	@GetMapping("show")
	public String showMsg() {
	 return "Hello from Provider";
	}

}
