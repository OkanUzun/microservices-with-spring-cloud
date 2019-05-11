package com.okan.studentclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class StudentclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentclientApplication.class, args);
    }

}
