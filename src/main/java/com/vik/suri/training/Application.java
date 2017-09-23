package com.vik.suri.training;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.vik.suri.training"})
public class Application {
	public static void main(String[] args) throws Exception {
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Application.class);
        ctx.registerShutdownHook();
    }
}
