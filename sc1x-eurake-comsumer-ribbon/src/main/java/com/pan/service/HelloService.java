package com.pan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {

	@Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
    	long startTiem = System.currentTimeMillis();
    	String forObject = restTemplate.getForObject("http://SERVICE-PRODUCER/hi?name="+name,String.class);
        return "本次请求耗时 【"+(System.currentTimeMillis()-startTiem)+"】"+forObject;
    }

	 public String hiError(String name) {
	        return "hi,"+name+",sorry,error!";
	    }


}
