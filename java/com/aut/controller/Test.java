package com.aut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Test {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
