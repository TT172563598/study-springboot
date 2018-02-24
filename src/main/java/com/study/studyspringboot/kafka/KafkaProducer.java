package com.study.studyspringboot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * ===================
 * User ：TT
 * Date ：2018/2/24
 * Time ：17:37
 * ===================
 */
@Component
public class KafkaProducer {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void sendMessage(String topic, String message) {
        logger.info("on message:{}", message);
        kafkaTemplate.send(topic, message);
    }
}
