# 📡 Kafka with Spring Boot - Simple Producer & Consumer Demo

This project demonstrates how to integrate **Apache Kafka** with **Spring Boot** in the simplest way possible.

It includes:
- A **REST API** that acts as a Kafka **producer**
- A **Kafka listener** that consumes the message and prints it to the console
- Minimal configuration using `application.properties`
- External verification using Kafka Console Consumer

---

Application Properties

spring.kafka.consumer.bootstrap-servers=localhost:9092
spring.kafka.consumer.group-id=myGroup
spring.kafka.consumer.auto-offset-reset=earliest
spring.kafka.consumer.key-deserializer=org.apache.kafka.common.serialization.StringDeserializer
spring.kafka.consumer.value-deserializer=org.apache.kafka.common.serialization.StringDeserializer

spring.kafka.producer.bootstrap-servers=localhost:9092
spring.kafka.producer.key-serializer=org.apache.kafka.common.serialization.StringSerializer
spring.kafka.producer.value-serializer=org.apache.kafka.common.serialization.StringSerializer


## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Apache Kafka
- Maven

---

🚀 How It Works
1. Start Zookeeper and Kafka Server using Kafka installation.
2. Run the Spring Boot application.
3. Use this GET API to send a message: http://localhost:8080/kafka/send?message=Hello World
4. The API sends this message to a Kafka topic using KafkaTemplate.
5. The @KafkaListener method listens to the topic and prints the message to the console.

Verify with Kafka Console Consumer
You can externally verify the message using the Kafka Console Consumer:
bin\windows\kafka-console-consumer.bat --topic my-topic --from-beginning --bootstrap-server localhost:9092

