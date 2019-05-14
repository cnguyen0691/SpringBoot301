package com.example.springboot301;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @GetMapping("/dog")
    public String loadForm(Model model){
        model.addAttribute("dog", new Dog());
        return "dog";
    }

    @PostMapping("/dog")
    public String loadForm(@Valid Dog dog, BindingResult result){
        if(result.hasErrors()){
            return "dog";
        }
        return "confirm";
    }
}
