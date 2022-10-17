package com.penguin.ouyang2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * [一句话描述该类的功能]
 *
 * @author : [欧阳志威]
 * @version : [v1.0]
 * @createTime : [2022/10/15 16:11]
 */
@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/haveatry")
    public String home(@RequestParam String name){
        return "client-test被调用，"+ "name为：" + name + ",被调用的服务端口port：" + port;
    }
}

