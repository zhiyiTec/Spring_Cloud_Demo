package com.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class ClientController {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("index.do")
    @ResponseBody
    public  String indexClient(){
        ResponseEntity<String> responseEntity=restTemplate.getForEntity("http://localhost:1000/index.do",String.class);
        return responseEntity.getBody();
    }
}
