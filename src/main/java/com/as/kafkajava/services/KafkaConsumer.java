package com.as.kafkajava.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.as.kafkajava.utils.AppConstants;

@Service
public class KafkaConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

	@KafkaListener(topics = AppConstants.TRANSACTION, groupId = AppConstants.GROUP_ID)
	public void consumeTransaction(String message) {
		LOGGER.info(String.format("Message received -> %s", message));
	}

	@KafkaListener(topics = AppConstants.INFORMATION, groupId = AppConstants.GROUP_ID)
	public void consumeInformation(String message) {
		LOGGER.info(String.format("Message received -> %s", message));
	}
}
