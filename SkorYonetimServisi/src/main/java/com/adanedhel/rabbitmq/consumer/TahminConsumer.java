package com.adanedhel.rabbitmq.consumer;

import com.adanedhel.rabbitmq.model.TahminModel;
import com.adanedhel.service.SkorService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TahminConsumer {
    private final SkorService skorService;

    @RabbitListener(queues = "queue-tahmin")
    public void tahminFromQueue(TahminModel model){
        skorService.skorGuncelle(model);
    }
}
