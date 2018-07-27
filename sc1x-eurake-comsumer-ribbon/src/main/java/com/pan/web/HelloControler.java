package com.pan.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pan.service.HelloService;

@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;
    
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return  "ribbon "+helloService.hiService(name);
    }


}