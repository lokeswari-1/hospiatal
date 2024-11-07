package com.example.Spring.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring.project.datamodels.dto.Hospitaldto;
import com.example.Spring.project.datamodels.dto.ResponseStructure;
import com.example.Spring.project.datamodels.entity.Hospital;
import com.example.Spring.project.service.serviceimplementation.Hospitalinterface;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
	@Autowired
	private Hospitalinterface hospitalinterface;
	@PostMapping("/save")
	public ResponseEntity<ResponseStructure<Hospital>> createhospital(@RequestBody Hospitaldto hospitaldto){
		return hospitalinterface.createHospital(hospitaldto);
	}

}
