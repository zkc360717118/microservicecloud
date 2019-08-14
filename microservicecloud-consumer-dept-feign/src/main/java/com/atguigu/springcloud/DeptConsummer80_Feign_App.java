package com.atguigu.springcloud;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
        import org.springframework.cloud.netflix.feign.EnableFeignClients;
        import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.atguigu.springcloud")
@ComponentScan("com.atguigu.springcloud")
public class DeptConsummer80_Feign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsummer80_Feign_App.class, args);
    }
}
