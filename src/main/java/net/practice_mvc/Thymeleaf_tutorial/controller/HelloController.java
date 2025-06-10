package net.practice_mvc.Thymeleaf_tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello-world")
    public String hello_world(Model model){
        model.addAttribute("hello_msg", "Hi! Welcome to Thymeleaf tutorial!");
        return "helloWorld";
    }
}
