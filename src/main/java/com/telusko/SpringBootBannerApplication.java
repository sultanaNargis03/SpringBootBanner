package com.telusko;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBannerApplication {

	public static void main(String[] args) 
	{
		//SpringApplication.run(SpringBootBannerApplication.class, args);
		SpringApplication app=new SpringApplication();
		app.setBannerMode(Mode.OFF);
		app.run(SpringBootBannerApplication.class, args);
		
	}

}
