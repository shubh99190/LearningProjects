package com.enduser.enduser;

import com.enduser.enduser.constant.EndUserConstant;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {


    @KafkaListener(topics = EndUserConstant.LOCATION_TOPIC_NAME,groupId = EndUserConstant.GROUP_ID)
    public void updatedLocation(String value) {
        System.out.println(value);
    }
}
