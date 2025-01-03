package com.example.javawebdemo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // This means that this class is a Controller
public class IndexController {
    @RequestMapping("/") // Map ONLY GET Requests, get directory / and return index.html
    public String index() {
        return "index";
    }
}
