package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author Yjw
 * 2022/10/5 13:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T>{

    private Integer code;
    private String  message;
    private T       data;

    public CommonResult(Integer code, String message){
        this(code, message, null);
    }
}
