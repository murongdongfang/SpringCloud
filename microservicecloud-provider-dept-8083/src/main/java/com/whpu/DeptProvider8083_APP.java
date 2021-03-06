package com.whpu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.whpu.dao")
@EnableEurekaClient  
@EnableDiscoveryClient
public class DeptProvider8083_APP {
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8083_APP.class, args);

	}

}
