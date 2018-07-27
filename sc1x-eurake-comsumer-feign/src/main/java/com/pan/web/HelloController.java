package com.pan.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pan.remote.HelloRemote;

@RestController
public class HelloController {

	@Autowired
	private HelloRemote hellowRemote;

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String sayHi(@RequestParam String name) {
		long startTime = System.currentTimeMillis();
		String sayHiFromClientOne = hellowRemote.sayHiFromClientOne(name);
		
		return "feign 本次請求耗時 【"+(System.currentTimeMillis()-startTime)+"】"+sayHiFromClientOne;
	}

}
