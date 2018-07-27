package com.pan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableCircuitBreaker
@EnableHystrix			// 熔断
@EnableHystrixDashboard	// 熔断仪表
@EnableFeignClients		// 负载
@EnableDiscoveryClient	// 消费端
@SpringBootApplication
public class ScEureakFeignApplication {
	
	  public static void main(String[] args) {
	        SpringApplication.run(ScEureakFeignApplication.class, args);
	    }

}
