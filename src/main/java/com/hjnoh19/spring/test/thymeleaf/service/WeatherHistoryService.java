package com.hjnoh19.spring.test.thymeleaf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjnoh19.spring.test.thymeleaf.domain.Weather;
import com.hjnoh19.spring.test.thymeleaf.repository.WeatherHistoryRepository;

@Service
public class WeatherHistoryService {
	
	@Autowired
	private WeatherHistoryRepository weatherHistoryRepository;

	public List<Weather> getWeatherList() {
		return weatherHistoryRepository.selectWeatherList();
	}

	public int addWeather(Weather weather) {
		return weatherHistoryRepository.insertWeather(weather);
		
	}

	
}
