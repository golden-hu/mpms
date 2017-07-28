package com.maopao.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * Created by hugo on 2017/6/10.
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue helloQueue(){
        return new Queue("hello");
    }

    @Bean
    public Queue MPMSQueue(){
        return new Queue("mpms");
    }

    @Bean
    public Queue objectQueue(){
        return new Queue("object");
    }
}
