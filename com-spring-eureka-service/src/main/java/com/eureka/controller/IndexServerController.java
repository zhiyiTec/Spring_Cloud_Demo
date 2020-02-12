package com.eureka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexServerController {
    @RequestMapping("index.do")
    @ResponseBody
    public Map<String,Object> indexClient(){
        Map<String,Object> map=new HashMap<>();
        map.put("测试","com-spring-eureka-service");
        return map;
    }
}
