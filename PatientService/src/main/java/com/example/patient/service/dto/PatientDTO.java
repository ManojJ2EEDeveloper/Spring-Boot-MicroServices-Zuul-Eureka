package com.example.patient.service.dto;

public class PatientDTO {
	
	private int patId;
	private int drugId;
	private String patFirstName;
	private String patLastName;
	private DrugDTO drugDTO;
	
	public PatientDTO(int patId, int drugId, String patFirstName, String patLastName) {
		super();
		this.patId = patId;
		this.drugId = drugId;
		this.patFirstName = patFirstName;
		this.patLastName = patLastName;
	}
	
	public int getDrugId() {
		return drugId;
	}
	public void setDrugId(int drugId) {
		this.drugId = drugId;
	}
	
	public int getPatId() {
		return patId;
	}
	public void setPatId(int patId) {
		this.patId = patId;
	}
	public String getPatFirstName() {
		return patFirstName;
	}
	public void setPatFirstName(String patFirstName) {
		this.patFirstName = patFirstName;
	}
	public String getPatLastName() {
		return patLastName;
	}
	public void setPatLastName(String patLastName) {
		this.patLastName = patLastName;
	}
	public DrugDTO getDrugDTO() {
		return drugDTO;
	}
	public void setDrugDTO(DrugDTO drugDTO) {
		this.drugDTO = drugDTO;
	}

}
