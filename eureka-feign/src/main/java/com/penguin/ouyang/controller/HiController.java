package com.penguin.ouyang.controller;

import com.penguin.ouyang.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * [一句话描述该类的功能]
 *
 * @author : [欧阳志威]
 * @version : [v1.0]
 * @createTime : [2022/10/15 16:50]
 */

@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/feignTest")
    public String sayHi(String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}

