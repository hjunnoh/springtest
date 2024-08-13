package com.hjnoh19.spring.test.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hjnoh19.spring.test.mvc.domain.Seller;
import com.hjnoh19.spring.test.mvc.service.SellerService;

@Controller
@RequestMapping("/mvc/seller")
public class SellerController {
	
	@Autowired
	private SellerService sellerService;

	@GetMapping("/info")
	public String sellerInfo(Model model, @RequestParam(value = "id", required = false) Integer id) {
		Seller seller = new Seller();
		if(id == null) {
			
			seller = sellerService.getLastSeller();
		} else {
			seller = sellerService.getSellerbyId(id);
		}
		model.addAttribute("result", seller);
		return "mvc/sellerInfo";
	}
	
	@PostMapping("/create")
	public String createSeller(
			@RequestParam("nickname") String nickname
			, @RequestParam("profileImage") String profileImage
			, @RequestParam("temperature") double temperature) {
		
		Seller seller = new Seller();
		
		seller.setNickname(nickname);
		seller.setProfileImage(profileImage);
		seller.setTemperature(temperature);
		
		sellerService.addSeller(seller);
		
		return "redirect:/mvc/seller/info";
	}
	
	@GetMapping("/input")
	public String sellerInput() {
		return "mvc/sellerInput";
	}
}
