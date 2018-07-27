package com.pan.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Value("${server.port}")
	private String port;

	@RequestMapping("/hi")
	public String home(@RequestParam String name) {
		return " 【8002】  hi " + name + ",i am from port:" + port;
	}
}
