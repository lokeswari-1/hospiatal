package com.example.Spring.project.service.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Spring.project.dao.Hospitaldao;
import com.example.Spring.project.datamodels.dto.Hospitaldto;
import com.example.Spring.project.datamodels.dto.ResponseStructure;
import com.example.Spring.project.datamodels.entity.Hospital;

@Service
public class HospitalServiceImplementation implements Hospitalinterface{
	@Autowired
private Hospitaldao hospitaldao;
	public ResponseEntity<ResponseStructure<Hospital>> createHospital(Hospitaldto hospitaldto){
		Hospital hospital=new Hospital();
		hospital.setHospitalName(hospitaldto.getHospitalName());
		ResponseStructure<Hospital> responsestructure=new  ResponseStructure<>();
		responsestructure.setData(hospitaldao.createHospital(hospital));
		responsestructure.setMessage("hospital created");
		responsestructure.setStatuscode(HttpStatus.CREATED.value());
		return new ResponseEntity(responsestructure,HttpStatus.CREATED);
	}

}
