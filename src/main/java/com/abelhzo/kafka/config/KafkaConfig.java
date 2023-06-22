package com.abelhzo.kafka.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerializer;

/**
 * @author: Abel HZO
 * @project: springboot-kafka
 * @file: KafkaConfig.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Jueves 22 Junio 2023, 13:21:31.
 * @description: El presente archivo KafkaConfig.java fue creado por Abel HZO.
 */
@Configuration
@EnableKafka
public class KafkaConfig {
	
	private Map<String, Object> propertiesConfig() {
		
		Map<String, Object> props = new HashMap<>();
		
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
		props.put(JsonSerializer.TYPE_MAPPINGS, "movementsDTO:com.abelhzo.kafka.dtos.MovementsDTO");
		
		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
		props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		props.put(JsonDeserializer.TYPE_MAPPINGS, "movementsDTO:com.abelhzo.kafka.dtos.MovementsDTO");
		
		return props;
	}
	
	private ProducerFactory<String, Object> producerFactory() {
		return new DefaultKafkaProducerFactory<>(propertiesConfig());
	}
	
	@Bean
	public KafkaTemplate<String, Object> kafkaTemplate() {
		return new KafkaTemplate<>(producerFactory());
	}
	
	private ConsumerFactory<String, Object> consumerFactory() {
		return new DefaultKafkaConsumerFactory<>(propertiesConfig());
	}
	
	@Bean
	public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, Object>>
			kafkaListenerContainerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, Object> kafkaListenerContainer =
				 new ConcurrentKafkaListenerContainerFactory<>();
		kafkaListenerContainer.setConsumerFactory(consumerFactory());
		return kafkaListenerContainer;
	}

}
