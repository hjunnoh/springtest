package com.hjnoh19.spring.test.thymeleaf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hjnoh19.spring.test.thymeleaf.domain.Weather;
import com.hjnoh19.spring.test.thymeleaf.service.WeatherHistoryService;

@Controller
@RequestMapping("/thymeleaf/weather")
public class WeatherHistoryController {
	
	@Autowired
	private WeatherHistoryService weatherHistoryService;

	@GetMapping("/info")
	public String weatherInfo(Model model) {
		
		List<Weather> weatherList = weatherHistoryService.getWeatherList();
		
		model.addAttribute(weatherList);
		
		return "thymeleaf/weatherInfo";
	}
}
