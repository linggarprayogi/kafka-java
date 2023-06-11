package com.as.kafkajava.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.as.kafkajava.pojo.TdEmail;
import com.as.kafkajava.services.KafkaProducer;
import com.as.kafkajava.utils.AppConstants;
import com.google.gson.Gson;

@RestController
@RequestMapping("/api/v1/kafka")
public class KafkaProducerController {

	private KafkaProducer kafkaProducer;

	public KafkaProducerController(KafkaProducer kafkaProducer) {
		this.kafkaProducer = kafkaProducer;
	}

	@GetMapping("/publish-transaction")
	public ResponseEntity<String> publishTransaction(@RequestParam("message") String message) {
		kafkaProducer.sendMessage(AppConstants.TRANSACTION, message);
		return ResponseEntity.ok("Message sent to kafka topic");
	}

	@GetMapping("/publish-information")
	public ResponseEntity<String> publishInformation(@RequestParam("message") String message) {
		TdEmail tdEmail = TdEmail.builder().email("linggar@gmail.com").idFilter(1).flagStatus("active").build();

		Gson    gson    = new Gson();
		String  jsonStr = gson.toJson(tdEmail);
		kafkaProducer.sendMessage(AppConstants.INFORMATION, jsonStr);
		return ResponseEntity.ok("Message sent to kafka topic");
	}
}
