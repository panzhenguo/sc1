package com.pan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrix	// 熔断
@EnableDiscoveryClient	//开启消费客户端
@EnableHystrixDashboard	//熔断仪表
@SpringBootApplication
public class ScEureakRibbonApplication {
	
	  public static void main(String[] args) {
	        SpringApplication.run(ScEureakRibbonApplication.class, args);
	    }

}
