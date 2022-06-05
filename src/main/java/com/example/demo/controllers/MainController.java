package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class MainController{

    @GetMapping("/")
    public String home( Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }
    @GetMapping("/updateissue")
    public String creeting( Model model) {
        model.addAttribute("title", "Изменить задачу");
        return "updateissue";
    }
    @GetMapping("/deleteissue")
    public String delete( Model model) {
        model.addAttribute("title", "Удалить задачу");
        return "deleteissue";
    }

}