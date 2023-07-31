package com.adanedhel.service;

import com.adanedhel.rabbitmq.model.TahminModel;
import com.adanedhel.rabbitmq.producer.TahminProducer;
import com.adanedhel.repository.ITahminRepository;
import com.adanedhel.repository.entity.Tahmin;
import com.adanedhel.utility.ServiceManager;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class TahminService extends ServiceManager{
    private final ITahminRepository tahminRepository;
    private final RabbitTemplate rabbitTemplate;
    private final TahminProducer tahminProducer;


    public TahminService(ITahminRepository tahminRepository, RabbitTemplate rabbitTemplate, TahminProducer tahminProducer) {
        super(tahminRepository);
        this.tahminRepository = tahminRepository;
        this.rabbitTemplate = rabbitTemplate;
        this.tahminProducer = tahminProducer;
    }
    public Tahmin tahminYap(Long userId,String userTahmin){
        int sayac = 0;
        boolean dogruMu = false;
        Tahmin tahmin = new Tahmin();
        tahmin.setUserTahmin(userTahmin);
        tahmin.setUserId(userId);
        tahminProducer.convertAndSend(TahminModel.builder()
                        .userId(userId)
                        .userTahmin(userTahmin)
                        .dogruMu(dogruMu)
                .build());
        return tahmin;

    }
}
