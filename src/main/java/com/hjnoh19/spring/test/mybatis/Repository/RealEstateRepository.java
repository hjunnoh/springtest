package com.hjnoh19.spring.test.mybatis.Repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.hjnoh19.spring.test.mybatis.Domain.RealEstate;

@Mapper
public interface RealEstateRepository {

	public RealEstate selectRealEstateId(@Param("id") int id);
	
	public List<RealEstate> selectRealEstateRent(@Param("rent") int rent);

	public List<RealEstate> selectRealEstateAreaPrice(@Param("area") int area, @Param("price") int price);
	
	public int insertRealEstate(RealEstate realEstate);
}
