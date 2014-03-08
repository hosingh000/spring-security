package com.om.webapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
	
	public void addViewControllers(ViewControllerRegistry registery){
		
		registery.addViewController("/home").setViewName("home");
		registery.addViewController("/").setViewName("home");
		registery.addViewController("/hello").setViewName("hello");
		registery.addViewController("/login").setViewName("login");
		
	}

}
