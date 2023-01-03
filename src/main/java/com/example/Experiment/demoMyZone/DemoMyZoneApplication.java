package com.example.Experiment.demoMyZone;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoMyZoneApplication {

	

	public static void main(String[] args) {

		SpringApplication.run(DemoMyZoneApplication.class, args);
		
		String str1 = null;

		String str2 = null;
		
	    String formatStr = String.format("Language: %s", str1);
	    String formatStr2 = String.format("Language: %s", str2);
	    
	    System.out.println(formatStr + "formatStr2 : " + formatStr2);
	    
	    
	}
}