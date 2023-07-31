package com.adanedhel.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitmqConfig {
    String directExchangeTahmin="direct-exchange-tahmin";
    String queueTahmin="queue-tahmin";
    String bindingKey="bindingKey";
    @Bean
    DirectExchange directExchangeTahmin(){
        return new DirectExchange(directExchangeTahmin);
    }
    @Bean
    Queue queueTahmin(){
        return new Queue(queueTahmin);
    }
    @Bean
    public Binding bindingTahminDirectExchange(final Queue queueTahmin,final DirectExchange directExchangeTahmin){
        return BindingBuilder.bind(queueTahmin).to(directExchangeTahmin).with(bindingKey);
    }
}
