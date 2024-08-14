package com.hjnoh19.spring.test.mvc2.repository;

import org.apache.ibatis.annotations.Mapper;

import com.hjnoh19.spring.test.mvc2.domain.Realtor;

@Mapper
public interface RealtorRepository {

	public int insertRealtor(Realtor realtor);
}
