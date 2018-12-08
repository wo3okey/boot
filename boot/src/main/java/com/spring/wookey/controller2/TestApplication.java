package com.spring.wookey.controller2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class TestApplication{
    public static void main(String[] args) throws Exception {
    	new SpringApplicationBuilder(TestApplication.class)
    	.registerShutdownHook(true)
    	.run(args);
    }
}
