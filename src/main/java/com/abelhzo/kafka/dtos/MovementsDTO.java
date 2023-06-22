package com.abelhzo.kafka.dtos;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: Abel HZO
 * @project: springboot-kafka
 * @file: MovementsDTO.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Jueves 22 Junio 2023, 13:51:30.
 * @description: El presente archivo MovementsDTO.java fue creado por Abel HZO.
 */
public class MovementsDTO {

	private Long idMovement;
	private TypeMovement type;
	private Double amount;
	private LocalDateTime moment;
	private ClientDTO origin;
	private ClientDTO destination;
	private Set<StepDTO> stepsDTO = new HashSet<>(0);

	public Long getIdMovement() {
		return idMovement;
	}

	public void setIdMovement(Long idMovement) {
		this.idMovement = idMovement;
	}

	public TypeMovement getType() {
		return type;
	}

	public void setType(TypeMovement type) {
		this.type = type;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public ClientDTO getOrigin() {
		return origin;
	}

	public void setOrigin(ClientDTO origin) {
		this.origin = origin;
	}

	public ClientDTO getDestination() {
		return destination;
	}

	public void setDestination(ClientDTO destination) {
		this.destination = destination;
	}

	public Set<StepDTO> getStepsDTO() {
		return stepsDTO;
	}

	public void setStepsDTO(Set<StepDTO> stepsDTO) {
		this.stepsDTO = stepsDTO;
	}

}
