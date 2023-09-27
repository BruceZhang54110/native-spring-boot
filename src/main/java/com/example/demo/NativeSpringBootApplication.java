package com.example.demo;

import com.example.demo.config.MyPropertiesCtor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableConfigurationProperties(value = MyPropertiesCtor.class)
@SpringBootApplication
public class NativeSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(NativeSpringBootApplication.class, args);
	}

}
