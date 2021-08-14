package com.gxy.eat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/dict_type/*")
public class DictTypeController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @PostMapping("/login")
    @ResponseBody
    public void login(String loginName) {
        System.out.println(loginName);
    }
}
