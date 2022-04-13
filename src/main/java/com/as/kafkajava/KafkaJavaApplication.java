package com.as.kafkajava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaJavaApplication.class, args);
	}

	// KAFKA CONSUMER
//	@Bean
//	public NewTopic topic() {
//		return TopicBuilder.name("topic1").partitions(10).replicas(1).build();
//	}
//
//	@KafkaListener(id = "myId", topics = "topic1")
//	public void listen(String in) {
//		System.out.println(in);
//	}

//	// KAFKA PRODUCER
//	@Bean
//	public NewTopic topic() {
//		return TopicBuilder.name("topic1").partitions(10).replicas(1).build();
//	}
//
//	@Bean
//	public ApplicationRunner runner(KafkaTemplate<String, String> template) {
//		return args -> {
//			template.send("topic1", "testing");
//		};
//	}

}
