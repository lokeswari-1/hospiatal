package com.example.Spring.project.dao.daoimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Spring.project.dao.Branchdao;
import com.example.Spring.project.datamodels.entity.Branch;
import com.example.Spring.project.repository.BranchRepository;
@Repository
public class Branchdaoimpl  implements Branchdao{
	@Autowired
	private BranchRepository branchrepository;
	
	public Branch createBranch(Branch branch) {
		return branchrepository.save(branch);
	}
}