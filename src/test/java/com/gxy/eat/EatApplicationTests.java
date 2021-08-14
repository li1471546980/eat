package com.gxy.eat;

import com.gxy.eat.entity.DictType;
import com.gxy.eat.service.DictTypeService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class EatApplicationTests {

    @Resource
    private DictTypeService dictTypeService;
    @Test
    void contextLoads() {
        List<DictType> list = dictTypeService.list();
        System.out.println(list);
    }

}
