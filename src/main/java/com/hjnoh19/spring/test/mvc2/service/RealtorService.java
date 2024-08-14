package com.hjnoh19.spring.test.mvc2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjnoh19.spring.test.mvc2.domain.Realtor;
import com.hjnoh19.spring.test.mvc2.repository.RealtorRepository;

@Service
public class RealtorService {

	@Autowired
	private RealtorRepository realtorRepository;
	
	public int addRealtor(Realtor realtor) {
		return realtorRepository.insertRealtor(realtor);
	}
}
