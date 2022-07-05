package com.example.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String page(){
        return "index";
    }
    @GetMapping("/login1")
    public ModelAndView login(){
        var mav = new ModelAndView();
        mav.setViewName("login");
        return mav;
    }
    @GetMapping("/registar")
    public ModelAndView register(){
        var mav = new ModelAndView();
        mav.setViewName("registar");
        return mav;
    }
}