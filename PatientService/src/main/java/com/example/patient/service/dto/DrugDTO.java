package com.example.patient.service.dto;

public class DrugDTO {
	
	private int drugId;
	private String drugName;
	private String drugMfg;
	
	public DrugDTO(){
		
	}
	
	public DrugDTO(int drugId, String drugName, String drugMfg) {
		super();
		this.drugId = drugId;
		this.drugName = drugName;
		this.drugMfg = drugMfg;
	}
	
	public int getDrugId() {
		return drugId;
	}
	public void setDrugId(int drugId) {
		this.drugId = drugId;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public String getDrugMfg() {
		return drugMfg;
	}
	public void setDrugMfg(String drugMfg) {
		this.drugMfg = drugMfg;
	}
	
	@Override
	public String toString() {
		return "DrugDTO [drugId=" + drugId + ", drugName=" + drugName + ", drugMfg=" + drugMfg + "]";
	}

}
