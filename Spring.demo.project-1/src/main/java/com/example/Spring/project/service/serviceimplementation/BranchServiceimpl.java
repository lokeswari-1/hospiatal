package com.example.Spring.project.service.serviceimplementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Spring.project.dao.Branchdao;
import com.example.Spring.project.dao.Hospitaldao;
import com.example.Spring.project.datamodels.dto.Branchdto;
import com.example.Spring.project.datamodels.dto.ResponseStructure;
import com.example.Spring.project.datamodels.entity.Branch;
import com.example.Spring.project.datamodels.entity.Hospital;

@Service
public class BranchServiceimpl implements Branchinterface {
	@Autowired
	private Hospitaldao hospitaldao;
	@Autowired
	private Branchdao branchdao;

	    @Override
	    public ResponseEntity<ResponseStructure<Branch>> createBranch(Branchdto branchdto, int hospitalId) {
	        Hospital foundHospital = hospitaldao.fetchById(hospitalId);

	        Branch branch = new Branch();
	        branch.setBranchName(branchdto.getBranchname());
	        branch.setHospital(foundHospital);

	        List<Branch> branchList = foundHospital.getBranches();
	        if (branchList != null) {
	            branchList.add(branch);
	            
	        } else {
	            branchList = new ArrayList<>();
	            branchList.add(branch);
	            foundHospital.setBranches(branchList);
	        }

	        hospitaldao.createHospital(foundHospital);

	        ResponseStructure<Branch> responseStructure = new ResponseStructure<>();
	        responseStructure.setStatuscode(HttpStatus.CREATED.value());
	        responseStructure.setMessage("OK");
	        responseStructure.setData(branchdao.createBranch(branch));

	        return new ResponseEntity<>(responseStructure,HttpStatus.CREATED);
	    
	    
	   
	}

		
	
	}

