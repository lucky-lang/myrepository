package com.produce.producedemo.consumer;

import com.alibaba.fastjson.JSON;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KafkaConsumer {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void listen(ConsumerRecord<String,String> record){
        String topic = record.topic();
        String value = record.value();
        try {
            if (value != null){
                System.out.println(value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
