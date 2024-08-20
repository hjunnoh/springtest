package com.hjnoh19.spring.test.thymeleaf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
		
		model.addAttribute("weatherList", weatherList);
		
		return "thymeleaf/weatherInfo";
	}
	
	@GetMapping("/input")
	public String weatherInput() {
		return "thymeleaf/weatherInput";
	}
	
	@PostMapping("/create")
	public String createWeather(@ModelAttribute Weather weather, Model model) {
		weatherHistoryService.addWeather(weather);
		
		return "redirect:/thymeleaf/weather/info";
	}
}
