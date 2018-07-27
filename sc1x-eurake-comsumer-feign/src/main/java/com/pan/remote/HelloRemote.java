package com.pan.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pan.hystrix.HelloRemoteHystrix;

@FeignClient(name = "service-producer",fallback=HelloRemoteHystrix.class)
public interface HelloRemote {
	
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
