package com.hjnoh19.spring.test.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjnoh19.spring.test.mvc.domain.Seller;
import com.hjnoh19.spring.test.mvc.repository.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sellerRepository;
	
	public Seller getLastSeller() {
		return sellerRepository.selectLastSeller();
	}
	
	public int addSeller(Seller seller) {
		return sellerRepository.insertSeller(seller);
	}

	public Seller getSellerbyId(int id) {
		return sellerRepository.selectSellerbyId(id);
	}
}
