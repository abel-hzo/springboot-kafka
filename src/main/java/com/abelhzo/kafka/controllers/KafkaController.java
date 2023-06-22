package com.abelhzo.kafka.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abelhzo.kafka.dtos.MovementsDTO;
import com.abelhzo.kafka.producers.KafkaProducer;

/**
 * @author: Abel HZO
 * @project: springboot-kafka
 * @file: KafkaController.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Jueves 22 Junio 2023, 13:49:56.
 * @description: El presente archivo KafkaController.java fue creado por Abel HZO.
 */
@RestController
@RequestMapping
public class KafkaController {
	
	@Autowired
	private KafkaProducer kafkaProducer;

	@PostMapping
	public ResponseEntity<String> publishMessage(MovementsDTO movementsDTO) {
		return kafkaProducer.publishMessage(movementsDTO);
	}
	
}
