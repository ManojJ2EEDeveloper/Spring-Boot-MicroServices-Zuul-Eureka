package com.example.patient.service.controller;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.patient.service.dto.DrugDTO;
import com.example.patient.service.dto.PatientDTO;

@RestController
public class PatientLookUpController {
	
	static ArrayList<PatientDTO> patientDTO = new ArrayList<>();
	
	@Autowired
	RestTemplate restTemplate;
	
	static {
		patientDTO.add(new PatientDTO(59406, 1001, "Manoj" ,"Kumar"));
		patientDTO.add(new PatientDTO(59407, 1002, "Raj" ,"Mohammed"));
	}
	
	@GetMapping("/patients")
	public ArrayList<PatientDTO> getDrugs(){
		return patientDTO;
	}
	
	@GetMapping("/patient/{id}")
	public PatientDTO getPatientDetails(@PathVariable("id") String getPatId){
		
		String URL = "http://Drug-Service/drug/";
		
		Iterator<PatientDTO> i = patientDTO.iterator();
		while(i.hasNext()) {
			PatientDTO temp = i.next();
			if(temp.getPatId()==Integer.parseInt(getPatId)) {
				
				ResponseEntity<DrugDTO> response = restTemplate.exchange(URL + temp.getDrugId(), HttpMethod.GET, null, DrugDTO.class);
				DrugDTO dto = response.getBody();
				//DrugDTO dto = restTemplate.getForObject(URL + temp.getDrugId(), DrugDTO.class);
				temp.setDrugDTO(dto);
				return temp;
			}
		}
		return null;
	}
	

}
