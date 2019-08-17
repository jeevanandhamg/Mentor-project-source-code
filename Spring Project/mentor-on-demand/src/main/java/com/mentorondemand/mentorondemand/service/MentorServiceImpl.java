package com.mentorondemand.mentorondemand.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mentorondemand.mentorondemand.model.Mentor;
import com.mentorondemand.mentorondemand.repository.MentorRepository;

@Service
public class MentorServiceImpl implements MentorService {

	@Autowired
	MentorRepository mentorRepository;
public List<Mentor> getMentorDetails()
{
	return mentorRepository.findAll();
}
}
