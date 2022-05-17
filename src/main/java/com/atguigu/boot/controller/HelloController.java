package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

//controller的方法返回的对象转换成json格式数据返回给客户
//使用ResponseBody注解之后不会再走视图处理器
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String Hello(){
        //返回字符串给浏览器
        return "HelloWorld";
    }
}
