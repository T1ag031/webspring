package com.example.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class registarcontroller {
    @GetMapping("/voltar1")
    public String index() {
        return "index";
    }
}
