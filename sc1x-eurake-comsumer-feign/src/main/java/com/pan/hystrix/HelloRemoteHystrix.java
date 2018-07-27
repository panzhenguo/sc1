package com.pan.hystrix;

import org.springframework.stereotype.Component;

import com.pan.remote.HelloRemote;

@Component
public class HelloRemoteHystrix implements HelloRemote {

	@Override
	public String sayHiFromClientOne(String name) {
		return "请求超时 调用  【HelloRemoteHystrix】 ";
	}

}
