package com.abelhzo.kafka.dtos;

/**
 * @author: Abel HZO
 * @project: springboot-kafka
 * @file: StepDTO.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Jueves 22 Junio 2023, 15:53:12.
 * @description: El presente archivo StepDTO.java fue creado por Abel HZO.
 */
public class StepDTO {

	private Long idStep;
	private String step;
	private String action;

	public StepDTO() {
		super();
	}

	public StepDTO(Long idStep, String step, String action) {
		super();
		this.idStep = idStep;
		this.step = step;
		this.action = action;
	}

	public Long getIdStep() {
		return idStep;
	}

	public void setIdStep(Long idStep) {
		this.idStep = idStep;
	}

	public String getStep() {
		return step;
	}

	public void setStep(String step) {
		this.step = step;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

}
