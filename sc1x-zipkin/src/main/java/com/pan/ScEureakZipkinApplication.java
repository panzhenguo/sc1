package com.pan;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;


@EnableZipkinServer
@SpringBootApplication
public class ScEureakZipkinApplication {
	
	  public static void main(String[] args) {
	        SpringApplication.run(ScEureakZipkinApplication.class, args);
	    }

}
