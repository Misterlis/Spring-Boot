package com.example.demo.controllers;

import models.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import repositorios.TaskRepository;

@Controller
public class Spisokzadach {



    @Autowired(required = false)
    private TaskRepository taskRepositiry1;

    @GetMapping("/spisok")
    public String spisokName(Model model)
    {
        Iterable<Task> tasks = taskRepositiry1.findAll();
        model.addAttribute("task",tasks);
        return "spisok";
    }
}
