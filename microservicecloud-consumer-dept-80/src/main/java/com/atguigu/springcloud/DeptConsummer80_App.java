package com.atguigu.springcloud;

import com.atguigu.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//@RibbonClient 针对MICROSERVICECLOUD-DEPT 使用MySelfRule的自定义配置类
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration = MySelfRule.class)
public class DeptConsummer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsummer80_App.class, args);
    }
}
