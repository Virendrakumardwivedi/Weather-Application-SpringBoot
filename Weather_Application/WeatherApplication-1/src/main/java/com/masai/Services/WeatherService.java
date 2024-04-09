package com.masai.Services;

import com.masai.Exception.WeatherException;
import com.masai.models.WeatherForcast;

public interface WeatherService {
	
	
    WeatherForcast getForecastSummaryByLocationName(String cityName) throws WeatherException;
    String getHourlyForecastByLocationName(String cityName) throws WeatherException;
}
