package com.example.drug.service.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.drug.service.dto.DrugDTO;

@RestController
public class DrugServiceController {
	
	public static HashMap<Integer, DrugDTO> map = new HashMap<>();
	
	static {
		map.put(1001,new DrugDTO(1001,"METACINE","ABC"));
		map.put(1002,new DrugDTO(1002,"BETADINE","DEF"));
		map.put(1003,new DrugDTO(1003,"CALPHOL","GHI"));
	}
	
	@GetMapping("/drugs")
	public HashMap<Integer, DrugDTO> getDrugs(){
		return map;
	}
	
	@GetMapping("/drug/{id}")
	public DrugDTO getDrugInfo(@PathVariable("id") String getId){
		return map.get(Integer.parseInt(getId));
	}
	
	@PostMapping("/addDrug")
	public DrugDTO addDrugInfo(@RequestBody DrugDTO drugDTO){
		map.put(drugDTO.getDrugId(), drugDTO);
		return map.get(drugDTO.getDrugId());
	}
}
