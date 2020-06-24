package com.wukz.springcloud.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: client
 * @description:测试注册客户端
 * @author: wukz
 * @create: 2020-06-24 17:29
 */
@Controller
public class TestClientController {

    @Value("${server.port}")
    private String port;

    @GetMapping("msg")
    @ResponseBody
    public String getMsg(){
        return "This is MyClient!" + port;
    }
}
