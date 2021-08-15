package com.gxy.eat.utils;

import com.gxy.eat.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Component
public class UserUtils {

    private static final String LOGIN_USER = "loginUser";

    public static void setUser(User emp, HttpSession session) {
        session.setAttribute(LOGIN_USER, emp);
    }

    public static User getUser(HttpSession session) {
        return (User) session.getAttribute(LOGIN_USER);
    }

    public static User getUser() {
        return (User) getsession().getAttribute(LOGIN_USER);
    }

    private static HttpSession getsession() {
        return getRequest().getSession();
    }

    private static HttpServletRequest getRequest() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return requestAttributes.getRequest();
    }

}
