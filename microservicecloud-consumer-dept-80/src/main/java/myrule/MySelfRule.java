package myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MySelfRule { // @ConfigBean = applicationContext.xml
    @Bean
    public IRule myRule() {

//        return new RandomRule(); //用我们重新选择的随机算法替代默认的轮询
//        return new RoundRobinRule();
        return new CustomRule(); //自定义轮询算法，每个机器先访问5次，然后走下一次
    }

}