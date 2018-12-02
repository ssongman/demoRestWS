package com.song;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.song.controller","com.song.service"})
//@SpringBootApplication
public class DemoRestWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRestWsApplication.class, args);
	}
}
