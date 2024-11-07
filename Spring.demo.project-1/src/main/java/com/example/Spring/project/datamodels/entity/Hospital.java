package com.example.Spring.project.datamodels.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Hospital {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String hospitalName;
	private int branchcount;
	@OneToMany(mappedBy="hospital")
	
	private List<Branch> branches;
	
	

}
