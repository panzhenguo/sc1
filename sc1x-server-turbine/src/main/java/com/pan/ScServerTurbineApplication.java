package com.pan;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@SpringBootApplication
public class ScServerTurbineApplication {
	
	  public static void main(String[] args) {
	        SpringApplication.run(ScServerTurbineApplication.class, args);
	    }

}
