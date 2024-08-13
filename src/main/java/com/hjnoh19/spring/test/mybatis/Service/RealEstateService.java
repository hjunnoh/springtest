package com.hjnoh19.spring.test.mybatis.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjnoh19.spring.test.mybatis.Domain.RealEstate;
import com.hjnoh19.spring.test.mybatis.Repository.RealEstateRepository;

@Service
public class RealEstateService {
	
	//private RealEstate realEstate = new RealEstate(3, "푸르지용 리버 303동 1104호", 89, "매매", 100000, 0);
	
	@Autowired
	private RealEstateRepository realEstateRepository;

	public RealEstate getRealEstateId(int id) {
		return realEstateRepository.selectRealEstateId(id);
	}
	
	public List<RealEstate> getRealEstateRent(int rent) {
		return realEstateRepository.selectRealEstateRent(rent);
	}

	public List<RealEstate> getRealEstateAreaPrice(int area, int price) {
		return realEstateRepository.selectRealEstateAreaPrice(area, price);
	}
	
	public int addRealEstate(RealEstate realEstate) {
		return realEstateRepository.insertRealEstate(realEstate);
	}
	
	public int addRealEstate2(
			int realtorId
			,String address
			,int area
			,String type
			,int price
			,int rentPrice) {
		return realEstateRepository.insertRealEstate2(realtorId, address, area, type, price, rentPrice);
	}
	
	public int updateRealEstate(int id, String type, int price) {
		return realEstateRepository.updateRealEstate(id, type, price);
	}
	
	public int deleteRealEstate(int id) {
		return realEstateRepository.deleteRealEstate(id);
	}
	
}
