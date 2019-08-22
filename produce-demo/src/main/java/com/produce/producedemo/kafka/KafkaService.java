package com.produce.producedemo.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    public void sendKafkaMsg(String topic,String data){
        kafkaTemplate.send(topic,data);
    }
}
