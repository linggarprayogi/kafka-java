package com.as.kafkajava.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.as.kafkajava.utils.AppConstants;

@Configuration
public class KafkaTopicConfig {

//	@Bean
//	public NewTopic topicExample() {
//		return TopicBuilder.name("thing1").partitions(10).replicas(3).compact().build();
//	}

	@Bean
	public NewTopic topicTransaction() {
		return TopicBuilder.name(AppConstants.TRANSACTION).build();
	}

	@Bean
	public NewTopic topicsInformation() {
		return TopicBuilder.name(AppConstants.INFORMATION).build();
	}
}
