package com.example.Spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Spring.project.datamodels.entity.Branch;

public interface BranchRepository  extends JpaRepository<Branch,Integer>{

}
