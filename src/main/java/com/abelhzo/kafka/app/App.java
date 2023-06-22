package com.abelhzo.kafka.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: Abel HZO
 * @project: springboot-kafka
 * @file: App.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Jueves 22 Junio 2023, 13:19:55.
 * @description: El presente archivo App.java fue creado por Abel HZO.
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.abelhzo.kafka" })
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}

/**
 * 1.- Descargamos Apache Kafka de la pagina oficial:
 * https://kafka.apache.org/downloads 2.- Nos ubicamos en la carpeta de descarga
 * y descomprimimos:
 * 
 * tar xzvf kafka_2.13-3.5.0.tgz -C ../Desktop/
 * 
 * 3.- Nos ubicamos dentro de la carpeta /bin de la carpeta descomprimida
 * 
 * ~/Desktop/kafka_2.13-3.5.0/bin$
 * 
 * 4.- Arrancamos el la aplicación zookeper con el comando:
 * 
 * ./zookeeper-server-start.sh ../config/zookeeper.properties
 * 
 * 5- Por ultimo en otra consola arrancamos el apache kafka con el comando:
 * 
 * /kafka-server-start.sh ../config/server.properties
 */
