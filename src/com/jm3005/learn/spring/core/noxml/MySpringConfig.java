package com.jm3005.learn.spring.core.noxml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.jm3005.learn.spring.core.noxml")
@PropertySource("classpath:car.properties")
public class MySpringConfig {

}
