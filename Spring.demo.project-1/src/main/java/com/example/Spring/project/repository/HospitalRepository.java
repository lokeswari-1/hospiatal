package com.example.Spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Spring.project.datamodels.entity.Hospital;

public interface HospitalRepository  extends JpaRepository<Hospital,Integer>{

}
