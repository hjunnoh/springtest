package com.hjnoh19.spring.test.mvc2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hjnoh19.spring.test.mvc2.domain.Realtor;
import com.hjnoh19.spring.test.mvc2.service.RealtorService;

@Controller
@RequestMapping("/mvc2/realtor")
public class RealtorController {
	
	@Autowired
	private RealtorService realtorService;

	@PostMapping("/create")
	public String createRealtor(
//			@RequestParam("office") String office
//			, @RequestParam("phoneNumber") String phoneNumber
//			, @RequestParam("address") String address
//			, @RequestParam("grade") String grade
			@ModelAttribute Realtor realtor
			, Model model) {
		
//		Realtor realtor = new Realtor();
//		
//		realtor.setOffice(office);
//		realtor.setPhoneNumber(phoneNumber);
//		realtor.setAddress(address);
//		realtor.setGrade(grade);
		
		realtorService.addRealtor(realtor);
		
		model.addAttribute("result", realtor);
		
		return "mvc2/realtorInfo";
	}
	
	@GetMapping("/input")
	public String realtorInput() {
		return "mvc2/realtorInput";
	}
}
