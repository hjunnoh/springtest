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
	
	public int insertRealEstate2(
			@Param("realtorId") int realtorId
			, @Param("address") String address
			, @Param("area") int area
			, @Param("type") String type
			, @Param("price") int price
			, @Param("rentPrice") int rentPrice
			);
	
	public int updateRealEstate(
			@Param("id") int id
			, @Param("type") String type
			, @Param("price") int price);
	
	public int deleteRealEstate(@Param("id") int id);
	
}
