package com.whpu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer   //Eureka微服务服务器端，接受其他微服务注册进来
public class EureServer7001_APP {
	public static void main(String[] args) {
		SpringApplication.run(EureServer7001_APP.class, args);
	}
}
