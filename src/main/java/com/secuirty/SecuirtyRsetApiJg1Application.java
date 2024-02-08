package com.secuirty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication(scanBasePackages = {"com"})
public class SecuirtyRsetApiJg1Application {

	public static void main(String[] args) {
		SpringApplication.run(SecuirtyRsetApiJg1Application.class, args);
	}

}
