package com.pan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ScEureakZuulApplication {
	
	  public static void main(String[] args) {
	        SpringApplication.run(ScEureakZuulApplication.class, args);
	    }

}
