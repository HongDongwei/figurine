package com.figurine;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = "com.figurine.dao")
@EnableTransactionManagement
public class FigurineApplication {

	public static void main(String[] args) {
		SpringApplication.run(FigurineApplication.class, args);
	}

}
