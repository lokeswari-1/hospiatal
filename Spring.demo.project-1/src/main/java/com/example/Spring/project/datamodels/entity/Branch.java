package com.example.Spring.project.datamodels.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Entity
@Data
public class Branch {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String branchName;
	@ManyToOne
	@JoinColumn
	private Hospital hospital;
	@OneToOne
	private Address address;
	@ManyToMany
	@JoinTable(joinColumns=@JoinColumn,inverseJoinColumns=@JoinColumn)
	private List<Doctor> doctors;
}
