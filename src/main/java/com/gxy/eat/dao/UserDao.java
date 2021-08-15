package com.gxy.eat.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxy.eat.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
