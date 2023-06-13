package com.example.demo;

import com.example.demo.entity.Kisi;
import com.example.demo.service.KisiRepo;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import java.util.Date;

@SpringBootApplication
@EnableElasticsearchRepositories (basePackages = "com.example.demo.service")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
