package com.tsl.kafka_demo.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "my-topic", groupId = "myGroup")
    public void consumeMessage(String message) {
        System.out.println("Message consumed from topic: " + message);
    }

}
