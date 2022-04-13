package com.as.kafkajava.producer;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.core.KafkaAdmin.NewTopics;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {

	@Bean
	public KafkaAdmin.NewTopics topic() {
		return new NewTopics(TopicBuilder.name("topic1").partitions(10).replicas(1).build(),
				TopicBuilder.name("topic2").partitions(10).replicas(1).build());
	}

	@Bean
	public ApplicationRunner runner(KafkaTemplate<String, String> template) {
		return args -> {
			template.send("topic1", "content dari topic 1 new");
			template.send("topic2", "content dari topic 2 new");
		};
	}
}
