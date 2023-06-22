package com.abelhzo.kafka.consumers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.abelhzo.kafka.dtos.MovementsDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * @author: Abel HZO
 * @project: springboot-kafka
 * @file: KafkaConsumer.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Jueves 22 Junio 2023, 15:56:15.
 * @description: El presente archivo KafkaConsumer.java fue creado por Abel HZO.
 */
@Component
public class KafkaConsumer {

	private Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);
	
	@KafkaListener(topics = "topicKafka", groupId = "group01")
	public void handleMessage(MovementsDTO movementsDTO) throws JsonProcessingException {
		logger.info("\n{}", new ObjectMapper()
							   .registerModule(new JavaTimeModule())
				               .writerWithDefaultPrettyPrinter()
				               .writeValueAsString(movementsDTO));
	}
	
}