/*
 * ApiDecoratorApplication.java
 *
 * This source file is Proprietary and Confidential.
 *
 * Redistribution and use in source and binary forms, without consent
 * are strictly forbidden.
 *
 * Copyright (c) 2014 Gogo LLC. All rights reserved.
 */
package com.adt.mtosi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.adt.mtosi")
@PropertySource(ignoreResourceNotFound=true, value={"classpath:mtosi.properties", 
		"classpath:mtosi-${spring.profiles.active}.properties", "classpath:application.properties"})
@EnableCaching
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
   
}
