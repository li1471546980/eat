package com.gxy.eat.controller;


import com.gxy.eat.entity.User;
import com.gxy.eat.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user/*")
public class LoginController {

    @Resource
    private UserService userService;

    @GetMapping("/index")
    public String index() {
        return "login";
    }

    @RequestMapping("/login")
    public void login(@RequestParam("loginName") String loginName,
                      @RequestParam("password") String password,
                      HttpSession session,
                      HttpServletResponse response) throws Exception {
        User valid = userService.valid(loginName, password, session);
        if (valid == null) {
            response.sendRedirect("/user/index");
//            throw new Exception("账号或密码错误！");
        } else {
            response.sendRedirect("/user/home");
        }
    }

    @RequestMapping("/home")
    public String home() {
        return "home";
    }
}
