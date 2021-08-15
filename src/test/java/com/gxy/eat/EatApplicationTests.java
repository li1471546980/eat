package com.gxy.eat;

import com.gxy.eat.entity.DictType;
import com.gxy.eat.entity.User;
import com.gxy.eat.service.DictTypeService;
import com.gxy.eat.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@SpringBootTest
class EatApplicationTests {

    @Resource
    private DictTypeService dictTypeService;

    @Resource
    private UserService userService;

    @Test
    void contextLoads() {
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setLoginName("lichaojie");
        user.setPassword("123");
        user.setIsValid(true);
        user.setCreateBy("SYS");
        user.setCreateId("SYS");
        user.setCreateTime(new Date());
        user.setUpdateBy("SYS");
        user.setUpdateId("SYS");
        user.setUpdateTime(new Date());
        userService.save(user);
    }

}
