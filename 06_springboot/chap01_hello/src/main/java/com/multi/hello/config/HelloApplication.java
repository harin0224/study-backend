package com.multi.hello.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 이 파일이 밖으로 나와있으면(hello 아래) 에러 없이 제대로 동작함(자동으로 scan 이 됨)
// config 안에 들어가있으면 scan 필요함
// 자동으로 con multi hello 까지는 잡힘
// ContextConfiguration에 @ComponentScan으로 설정해주는 듯
@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}
