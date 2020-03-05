package com.like;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication   //来标注这是一个主启动类，说明这是一个SpringBoot应用
public class HelloWorldMainApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldMainApplication.class, args);
	}
}
