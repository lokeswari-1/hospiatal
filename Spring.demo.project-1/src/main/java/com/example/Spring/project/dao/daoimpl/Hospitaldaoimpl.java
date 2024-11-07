package com.example.Spring.project.dao.daoimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Spring.project.dao.Hospitaldao;
import com.example.Spring.project.datamodels.entity.Hospital;
import com.example.Spring.project.exception.DataNotFoundException;
import com.example.Spring.project.repository.HospitalRepository;
@Repository
public class Hospitaldaoimpl  implements Hospitaldao{
	@Autowired
	private HospitalRepository hospitalrepository;
	@Override
	public Hospital createHospital(Hospital hospital) {
		return hospitalrepository.save(hospital);
	}
	
	public Hospital fetchById(int hospitalId) {
		Optional<Hospital> findHospital= hospitalrepository.findById(hospitalId);
		if(findHospital.isPresent()) {
			return findHospital.get();
			
		}
		else {
			throw new DataNotFoundException("hospital not found");
		}
	}

	

}
