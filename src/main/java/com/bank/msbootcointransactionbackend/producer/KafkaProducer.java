package com.bank.msbootcointransactionbackend.producer;

import com.bank.msbootcointransactionbackend.models.utils.DataEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {

    private static final Logger log = LoggerFactory.getLogger(KafkaProducer.class);

    @Value("${kafka.topic.transaction}")
    private String topicTransaction;

    @Autowired
    private KafkaTemplate<String, DataEvent<?>> producer;

    public void sendMessage(DataEvent<?> dataEvent) {
        log.info("Producing topic {}, message {}",topicTransaction, dataEvent.toString());
        this.producer.send(topicTransaction, dataEvent);
    }

}