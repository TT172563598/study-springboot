package com.study.studyspringboot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * ===================
 * User ：TT
 * Date ：2018/2/24
 * Time ：17:38
 * ===================
 */
@Component
public class VideoCosConsumer {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @KafkaListener(topics = {"test-topic"})
    public void consumerMessage(String message) {
        logger.info("on message:{}", message);
    }
}
