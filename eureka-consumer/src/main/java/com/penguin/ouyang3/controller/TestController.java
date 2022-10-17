package com.penguin.ouyang3.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * [一句话描述该类的功能]
 *
 * @author : [欧阳志威]
 * @version : [v1.0]
 * @createTime : [2022/10/15 17:11]
 */
@RestController
public class TestController {
    @Value("${server.port}")
    String port;
    @RequestMapping("/haveatry")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) throws InterruptedException {

        return "微服务 client-test被调用， " + "name为:"+name + " ,被调用的服务端口 port:" + port;
    }
}

