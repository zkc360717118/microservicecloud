package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer_7005_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7005_App.class, args);
    }
}
