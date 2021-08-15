package com.gxy.eat.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gxy.eat.dao.UserDao;
import com.gxy.eat.entity.User;
import com.gxy.eat.utils.UserUtils;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class UserService extends ServiceImpl<UserDao, User> {


    public User valid(String loginName, String password, HttpSession session) {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getLoginName, loginName);
        wrapper.eq(User::getPassword, password);
        wrapper.eq(User::getIsValid, true);
        User user = baseMapper.selectOne(wrapper);
        if (user != null) {
            UserUtils.setUser(user, session);
            return user;
        }
        return null;
    }
}
