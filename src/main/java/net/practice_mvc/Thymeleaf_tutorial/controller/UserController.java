package net.practice_mvc.Thymeleaf_tutorial.controller;

import net.practice_mvc.Thymeleaf_tutorial.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/variable-expressions")
    public String variableExpression(Model model){
        User user1 = new User("Anushree", "anushreebhatt357@gmail.com", "ADMIN", "female");
        List<User> users = Arrays.asList(
                user1,
                new User("Ramesh", "ramesh@gmail.com", "USER", "male"),
                new User("Ananya", "ananya@gmail.com", "USER", "female")
        );
        model.addAttribute("user", user1);
        model.addAttribute("users", users);
        return "variable_expressions";
    }

    @GetMapping("/selection-expressions")
    public String selectionExpression(Model model){
        User user1 = new User("Anushree", "anushreebhatt357@gmail.com", "ADMIN", "female");
        model.addAttribute("user", user1);
        return "selection_expressions";
    }

    @GetMapping("/message-expressions")
    public String messageExpression(Model model){
        return "message_expressions";
    }

    @GetMapping("/link-expressions")
    public String linkExpression(Model model){
        model.addAttribute("user_id",1);
        return "link_expressions";
    }

    @GetMapping(value = "/link-expressions-param")
    @ResponseBody
    public String linkExpression_with_parameter1(@RequestParam String name){
        return "Hi "+name+"!";
    }

    @GetMapping(value = "/link-expressions-param1/{name}")
    @ResponseBody
    public String linkExpression_with_parameter2(@PathVariable String name){
        return "Hi "+name+"!";
    }

    @GetMapping(value = "/link-expressions-param2/{id}")
    @ResponseBody
    public String linkExpression_with_parameter3(@PathVariable Integer id){
        return "Your id id:"+id;
    }

    @GetMapping("/fragment_expressions")
    public String fragment_expressions(){
        return "fragment_expressions";
    }

    @GetMapping("/looping")
    public String looping(Model model){
        User user1 = new User("Anushree", "anushreebhatt357@gmail.com", "ADMIN", "female");
        List<User> users = Arrays.asList(
                user1,
                new User("Ramesh", "ramesh@gmail.com", "USER", "male"),
                new User("Ananya", "ananya@gmail.com", "USER", "female")
        );
        model.addAttribute("user", user1);
        model.addAttribute("users", users);
        return "looping.html";
    }

    @GetMapping("/if_unless")
    public String if_unless(Model model){
        User user1 = new User("Anushree", "anushreebhatt357@gmail.com", "ADMIN", "female");
        List<User> users = Arrays.asList(
                user1,
                new User("Ramesh", "ramesh@gmail.com", "USER", "male"),
                new User("Ananya", "ananya@gmail.com", "USER", "female")
        );
        model.addAttribute("user", user1);
        model.addAttribute("users", users);
        return "if_unless.html";
    }

    @GetMapping("/switch_case")
    public String switch_case(Model model){
        User user1 = new User("Anushree", "anushreebhatt357@gmail.com", "ADMIN", "female");
        User user2 = new User("Ananya", "ananya@gmail.com", "USER", "female");
        User user3 = new User("Sam", "sam@gmail.com", "GUEST", "female");
        model.addAttribute("user", user3);
        return "switch_case.html";
    }


}
