package com.example.spring;

import com.example.bd.BLL.ClienteBLL;
import com.example.bd.DAL.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class IndexController {
    @GetMapping("/index1")
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