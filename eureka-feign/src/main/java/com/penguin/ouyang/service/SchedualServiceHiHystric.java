package com.penguin.ouyang.service;

import org.springframework.stereotype.Component;

/**
 * [一句话描述该类的功能]
 *
 * @author : [欧阳志威]
 * @version : [v1.0]
 * @createTime : [2022/10/15 16:49]
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry! 网络异常，服务暂时无法访问。请求的name为："+ name;
    }
}

