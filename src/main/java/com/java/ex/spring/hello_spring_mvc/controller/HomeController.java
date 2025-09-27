package com.java.ex.spring.hello_spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/about")
    public String aboutUs() {
        return "about";

    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/user")
    public String user(@RequestParam(name = "name") String name, @RequestParam(name = "age") int age, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("email", name + "@boolean.it");
        return "user";
    }

}
