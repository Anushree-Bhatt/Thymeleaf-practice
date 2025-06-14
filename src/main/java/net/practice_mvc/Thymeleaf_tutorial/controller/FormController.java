package net.practice_mvc.Thymeleaf_tutorial.controller;

import net.practice_mvc.Thymeleaf_tutorial.model.UserForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FormController {
    private Logger logger = LoggerFactory.getLogger(FormController.class);

    @GetMapping("/register")
    public String fetch_userForm(Model model){
        UserForm userForm = new UserForm(); //Empty userForm model object to store form data
        List<String> professions = Arrays.asList("Software Engineer", "Data Analyst", "Devops Engineer");

        Map<String, Object> attributes_map = new HashMap<>();
        attributes_map.put("userForm", userForm);
        attributes_map.put("professions", professions);

        model.addAllAttributes(attributes_map);
        return "register_form.html";
    }

    @PostMapping("/register/save")
    public String save_user(@ModelAttribute UserForm userForm, Model model){
        logger.info(userForm+"");
        model.addAttribute("user_data", userForm);
        return "user_data";
    }

}
