package com.example.javawebdemo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // This means that this class is a Controller
public class InfoController {
    @GetMapping("/about-us") // Map ONLY GET Requests, get directory /about-us and return about-us.html
    public String aboutUs() {
        return "info/about-us";
    }

    @GetMapping("/contact-us") //   Map ONLY GET Requests, get directory /contact-us and return contact-us.html
    public String contactUs() {
        return "info/contact-us";
    }

    @GetMapping("/blog-post") //  Map ONLY GET Requests, get directory /blog-post and return blog-post.html
    public String blogPost() {
        return "info/blog-post";
    }
}
