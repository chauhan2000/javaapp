package com.example.javawebdemo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller  // This means that this class is a Controller
public class AuthController {
    @GetMapping("/login") // Map ONLY GET Requests, get directory /login and return login.html
    public String login() {
        return "auth/login";
    }

    @PostMapping("/login") // Map ONLY POST Requests, get directory /login and return login.html
    public String loginPost() {
        return "redirect:/";
    }

    @GetMapping("/register") // Map ONLY GET Requests, get directory /register and return register.html
    public String register() {
        return "auth/registration";
    }

    @GetMapping("/logout") // Map ONLY GET Requests, get directory /logout and return logout.html
    public String logout() {
        return "auth/logout";
    }
}
