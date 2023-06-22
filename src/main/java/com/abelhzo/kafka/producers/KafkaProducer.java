package com.abelhzo.kafka.producers;

import java.time.LocalDateTime;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.abelhzo.kafka.dtos.MovementsDTO;
import com.abelhzo.kafka.dtos.StepDTO;

/**
 * @author: Abel HZO
 * @project: springboot-kafka
 * @file: KafkaProducer.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Jueves 22 Junio 2023, 14:03:15.
 * @description: El presente archivo KafkaProducer.java fue creado por Abel HZO.
 */
@Service
public class KafkaProducer {
	
	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	
	public ResponseEntity<String> publishMessage(MovementsDTO movementsDTO) {
		
		Long id = System.currentTimeMillis();
		
		movementsDTO.setIdMovement(id);
		movementsDTO.setMoment(LocalDateTime.now());
		movementsDTO.getStepsDTO().addAll(
				Set.of(new StepDTO(id, "PENDIENTE", "ESPERA"),
					   new StepDTO(id, "ALTA", "INSERTAR")));
		
		kafkaTemplate.send("topicKafka", movementsDTO);
		
		return new ResponseEntity<String>("Publicado con exito!!!", HttpStatus.OK);
	}

}
