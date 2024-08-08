package com.hjnoh19.spring.test.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hjnoh19.spring.test.mybatis.Domain.RealEstate;
import com.hjnoh19.spring.test.mybatis.Service.RealEstateService;

@Controller
@RequestMapping("/mybatis/real-estate")
public class RealEstateController {
	
	@Autowired
	private RealEstateService realEstateService;

	@ResponseBody
	@RequestMapping("/1")
	public RealEstate realEstateId(@RequestParam("id") int id) {
		return realEstateService.getRealEstateId(id);
	}
	
	@ResponseBody
	@RequestMapping("/2")
	public List<RealEstate> realEstateRent(@RequestParam("rent") int rent) {
		return realEstateService.getRealEstateRent(rent);
	}
	
	@ResponseBody
	@RequestMapping("/3")
	public List<RealEstate> realEstateAreaPrice(@RequestParam("area") int area, @RequestParam("price") int price) {
		return realEstateService.getRealEstateAreaPrice(area, price);
	}
}
