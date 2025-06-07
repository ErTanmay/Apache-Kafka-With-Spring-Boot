package com.tsl.kafka_demo.controller;

import com.tsl.kafka_demo.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class MyController {

    private KafkaProducer kafkaProducer;

    @Autowired
    public MyController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    //http://localhost:8080/kafka/send?message=Hello%20Kafka

    @GetMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestParam("message") String message) {
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to Kafka topic: " + message);
    }
}
