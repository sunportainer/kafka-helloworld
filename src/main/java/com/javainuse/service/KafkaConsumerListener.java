package com.javainuse.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerListener {

    @KafkaListener(topics = {"test"},groupId = "group1",
            containerFactory="kafkaListenerContainerFactory")
    public void kafkaListener1(String message){
        System.out.println(message);
    }
    /*
    @KafkaListener(topics = "topic_login", groupId = "group1")
    public void onLoginMessage(@Payload String message, @Header("type") String type) throws Exception {
        LoginMessage msg = objectMapper.readValue(message, getType(type));
        logger.info("received login message: {}", msg);
    }
    */
    @KafkaListener(topics = {"helloworld"},groupId = "group1",
            containerFactory="kafkaListenerContainerFactory")
    public void kafkaListener2(String message){
        System.out.println(message);
    }
}