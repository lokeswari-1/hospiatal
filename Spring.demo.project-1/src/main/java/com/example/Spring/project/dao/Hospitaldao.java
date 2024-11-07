package com.example.Spring.project.dao;

import com.example.Spring.project.datamodels.entity.Hospital;

public interface Hospitaldao {
	Hospital createHospital(Hospital hospital);

	Hospital fetchById(int hospitalId);
	

}
