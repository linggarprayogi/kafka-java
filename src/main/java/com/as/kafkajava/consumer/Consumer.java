package com.as.kafkajava.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	@KafkaListener(id = "myConsumerId", topics = "topic1")
	public void listenTopic1(String in) {
		System.out.println(in);
	}

	@KafkaListener(id = "myConsumerId2", topics = "topic2")
	public void listenTopic2(String in) {
		System.out.println(in);
	}
}
