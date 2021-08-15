package com.gxy.eat.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gxy.eat.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("sys_user")
public class User extends BaseEntity {
    private String loginName;
    private String password;
}
