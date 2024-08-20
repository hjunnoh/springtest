package com.hjnoh19.spring.test.thymeleaf.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hjnoh19.spring.test.thymeleaf.domain.Weather;

@Mapper
public interface WeatherHistoryRepository {

	public List<Weather> selectWeatherList();

	public int insertWeather(Weather weather);

	
}
