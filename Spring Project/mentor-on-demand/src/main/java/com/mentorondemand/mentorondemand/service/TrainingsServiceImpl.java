package com.mentorondemand.mentorondemand.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mentorondemand.mentorondemand.model.Trainings;
import com.mentorondemand.mentorondemand.repository.TrainingsRepository;

@Service
public class TrainingsServiceImpl implements TrainingsService{

	@Autowired
	TrainingsRepository trainingsRepository;

	@Override
	public List<Trainings> getTrainingsDetails() {
		// TODO Auto-generated method stub
		return trainingsRepository.findAll();
	}
	
	
}
