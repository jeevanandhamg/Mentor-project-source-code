package com.mentorondemand.mentorondemand.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mentorondemand.mentorondemand.model.Trainings;
import com.mentorondemand.mentorondemand.service.TrainingsService;

@RestController
@RequestMapping("/trainings")
public class TrainingsController {


	@Autowired
	private TrainingsService trainingsService;
	
	@GetMapping("/trainingsdet")
	public List<Trainings> getTrainingsDet()
	{
		return trainingsService.getTrainingsDetails();
	}
}
