package com.deliveryagent.deliveryagent.controller;

import com.deliveryagent.deliveryagent.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class KafkaController {

    @Autowired
    private KafkaService kafkaService;
    @PostMapping("/update")
    public ResponseEntity<?> updateLocation() {

        for (int i=1;i<=1000;i++) {
            this.kafkaService.updateLocation("(" + Math.round(Math.random() * 100)+ ", "
                    + Math.round(Math.random() *100) + ")");
        }
        return new ResponseEntity<>(Map.of("message","location updated successfully"), HttpStatus.OK);
    }
}
