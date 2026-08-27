package com.example.kafkademo.consumer;

import com.example.kafkademo.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class KafkaConsumer {

    // @KafkaListener(topics = "kafka", groupId = "myGroup")
    public void consumeMsg(String msg) {
        log.info(format("Consuming the message from kafka Topic:: %s", msg));
    }

    @KafkaListener(topics = "kafka", groupId = "myGroup")
    public void consumeJsonMsg(Student student) {
        log.info(format("Consuming the message from kafka Topic:: %s", student.toString()));
    }
}
