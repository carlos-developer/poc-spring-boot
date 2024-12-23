package com.juan.poc.springboot.webapp.poc_springboot;

import com.juan.poc.springboot.webapp.poc_springboot.repositories.IProductRepository;
import com.juan.poc.springboot.webapp.poc_springboot.repositories.ProductRepositoryJson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config.properties")
public class AppConfig {

    @Bean
    @Primary
    public IProductRepository productRepositoryJson() {
        return new ProductRepositoryJson();
    }
}
