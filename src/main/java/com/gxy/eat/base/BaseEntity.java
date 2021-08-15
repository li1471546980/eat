package com.gxy.eat.base;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;


@Data
public class BaseEntity {
    @TableId
    private String id;
    private Boolean isValid;
    private Date createTime;
    private String createBy;
    private String createId;
    private Date updateTime;
    private String updateBy;
    private String updateId;
}
