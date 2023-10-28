package com.jett1;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    // reading from the topic
    @KafkaListener(topics = "jettcode",
                   groupId = "foo")
    void listener(String data) {
        System.out.println("Listener received:  " + data);
    }

}
