package com.hjnoh19.spring.test.mvc.repository;

import org.apache.ibatis.annotations.Mapper;

import com.hjnoh19.spring.test.mvc.domain.Seller;

@Mapper
public interface SellerRepository {

	public Seller selectLastSeller();
	
	public int insertSeller(Seller seller);

	public Seller selectSellerbyId(int id);
}
