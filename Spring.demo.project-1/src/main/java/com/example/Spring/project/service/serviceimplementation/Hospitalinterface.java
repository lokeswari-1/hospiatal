package com.example.Spring.project.service.serviceimplementation;

import org.springframework.http.ResponseEntity;

import com.example.Spring.project.datamodels.dto.Hospitaldto;
import com.example.Spring.project.datamodels.dto.ResponseStructure;
import com.example.Spring.project.datamodels.entity.Hospital;

public interface Hospitalinterface {
	ResponseEntity<ResponseStructure<Hospital>> createHospital(Hospitaldto hospitaldto);
	

}
