package com.juan.poc.springboot.webapp.poc_springboot;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:data.properties")
public class AppConfig {
}
