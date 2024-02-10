package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class NavController {
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	@GetMapping("/newSong")
	public String newSong() {
		return "newSong";
	}
	@GetMapping("/forgotPassword")
    public String forgotPassword() {
        return "resetPassword";
    }
	@GetMapping("/index")
    public String Home() {
        return "index";
    }
	@GetMapping("/adminHome")
    public String adminHome() {
        return "adminHome";
    }
	@GetMapping("/customerHome")
    public String customerHome() {
        return "customerHome";
    }

}
