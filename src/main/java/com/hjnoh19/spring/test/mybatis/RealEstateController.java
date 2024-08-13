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
	
	@RequestMapping("/insert/1")
	@ResponseBody
	public String createRealEstate() {
		RealEstate realEstate = new RealEstate();
		
		realEstate.setRealtorId(3);
		realEstate.setAddress("푸르지용 리버 303동 1104호");
		realEstate.setArea(89);
		realEstate.setType("매매");
		realEstate.setPrice(100000);
		
		return "삽입 개수 : " + realEstateService.addRealEstate(realEstate);
	}
	
	@RequestMapping("/insert/2")
	@ResponseBody
	public String createRealEstate2(@RequestParam("realtorId") int realtorId) {
		
		return "삽입 개수 : " + realEstateService.addRealEstate2(realtorId, "썅떼빌리버 오피스텔 814호", 45, "월세", 100000, 120);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public String updateRealEstate() {
		return "수정 성공 : " + realEstateService.updateRealEstate(22, "전세", 70000);
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public String deleteRealEstate(@RequestParam("id") int id) {
		return "삭제 성공 : " + realEstateService.deleteRealEstate(id);
		
	}
}
