package com.teknoserval.filedatabasepractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@Configuration
@ComponentScan({"com.teknoserval.filedatabasepractice.service"})
public class FiledatabasepracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiledatabasepracticeApplication.class, args);
	}

}
