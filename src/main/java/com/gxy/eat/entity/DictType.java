package com.gxy.eat.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("sys_dict_type")
@Data
public class DictType {

    private String id;
    private String code;
    private String name;

}
