package com.api.marketingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.marketingapp.Entities.Lead;
import com.api.marketingapp.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
	@Autowired
	private LeadRepository leadRepo;
  
	@Override
	public void saveReg(Lead lead) {
		leadRepo.save(lead);
	}

}
