package com.example.Spring.project.datamodels.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Doctor {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String name ;
	private double salary;
	private String specialization;
	@ManyToMany(mappedBy="doctors")
	 List<Branch> branches;
	
	

}
