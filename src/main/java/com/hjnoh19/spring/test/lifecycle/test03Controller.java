package com.hjnoh19.spring.test.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test03Controller {

	@RequestMapping("/lifecycle/test03/1")
	public String test03() {
		return "lifecycle/test03";
	}
}
