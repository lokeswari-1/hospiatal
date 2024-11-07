package com.example.Spring.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring.project.datamodels.dto.Branchdto;
import com.example.Spring.project.datamodels.dto.ResponseStructure;
import com.example.Spring.project.datamodels.entity.Branch;
import com.example.Spring.project.datamodels.entity.Hospital;
import com.example.Spring.project.service.serviceimplementation.Branchinterface;

@RestController
public class BranchController {
	@Autowired
	private Branchinterface branchinterface;
	@PostMapping("/addBranch/{hospitalId}")
	public ResponseEntity<ResponseStructure<Branch>> createBranch(@RequestBody Branchdto branchdto,@PathVariable int hospitalId){
		return branchinterface.createBranch(branchdto,hospitalId);
	}

}
