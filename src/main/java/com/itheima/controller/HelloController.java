package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//在com.itheima下面直接创建类controller.HelloController
// 直接就会创建出package（controller）及类（HelloController）
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
            return "Hello World!";
    }
}
