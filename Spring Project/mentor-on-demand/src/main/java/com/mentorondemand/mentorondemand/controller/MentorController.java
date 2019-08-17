package com.mentorondemand.mentorondemand.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mentorondemand.mentorondemand.model.Mentor;
import com.mentorondemand.mentorondemand.service.MentorService;

@RestController
@RequestMapping("/mentor")
public class MentorController {

	@Autowired
	private MentorService mentorService;
	
	@GetMapping("/mentordet")
	public List<Mentor> getMentorDetails()
	{
		return mentorService.getMentorDetails();
	}
}
