package com.produce.producedemo.test2;

import com.produce.producedemo.kafka.KafkaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest {
    @Autowired
    private KafkaService kafkaService;
    @Test
    public void test3(){
        kafkaService.sendKafkaMsg("test3","hello-kafka");
    }
}
