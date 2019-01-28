package com.talelife.edu.dict.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.talelife.edu.dict.dao")
@EnableSwagger2
@EnableEurekaClient
public class DictWebApplication {

	public static void main(String[] args) throws Exception {
       SpringApplication.run(DictWebApplication.class, args);
  }


}