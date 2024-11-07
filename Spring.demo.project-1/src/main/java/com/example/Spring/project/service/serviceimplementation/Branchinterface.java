package com.example.Spring.project.service.serviceimplementation;

import org.springframework.http.ResponseEntity;

import com.example.Spring.project.datamodels.dto.Branchdto;
import com.example.Spring.project.datamodels.dto.Hospitaldto;
import com.example.Spring.project.datamodels.dto.ResponseStructure;
import com.example.Spring.project.datamodels.entity.Branch;
import com.example.Spring.project.datamodels.entity.Hospital;

public interface Branchinterface {

	//ResponseEntity<ResponseStructure<Branch>> createHospital(Branchdto branchdto);
//
	ResponseEntity<ResponseStructure<Branch>> createBranch(Branchdto branchdto, int hospitalId);
//
//	ResponseEntity<ResponseStructure<Branch>> createBranch(Branchdto branchdto);
//	
}
