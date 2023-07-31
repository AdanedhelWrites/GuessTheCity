package com.adanedhel.rabbitmq.producer;

import com.adanedhel.rabbitmq.model.TahminModel;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TahminProducer {
    private final RabbitTemplate rabbitTemplate;

    public void convertAndSend(TahminModel model){
        rabbitTemplate.convertAndSend("direct-exchange-tahmin","bindingKey",model);
    }
}
