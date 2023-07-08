package com.example.Experiment.demoMyZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoMyZoneApplication {

	

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(DemoMyZoneApplication.class, args);
		Aliean bean = context.getBean(Aliean.class);
		
		bean.show();
		
	    
	}
}