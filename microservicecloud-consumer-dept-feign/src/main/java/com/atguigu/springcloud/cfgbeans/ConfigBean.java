package com.atguigu.springcloud.cfgbeans;

import com.netflix.loadbalancer.*;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean { // @ConfigBean = applicationContext.xml
    @Bean
    @LoadBalanced //spring cloud ribbon 是基于netflix  ribbon实现的一套客户端 负载均衡工具
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    //注释的原因是前面主启动类开启了自定义的
//    @Bean
//    public IRule myRule() {
////        return new RoundRobinRule();
//        return new RandomRule(); //用我们重新选择的随机算法替代默认的轮询
////        return new AvailabilityFilteringRule();
////        return new WeightedResponseTimeRule();
////        return new RetryRule(); //
////        return new BestAvailableRule();
////        return ZoneAvoidanceRule();
//    }

}
