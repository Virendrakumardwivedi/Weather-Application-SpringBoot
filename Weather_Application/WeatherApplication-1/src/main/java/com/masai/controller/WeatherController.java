package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.WeatherException;
import com.masai.Services.WeatherService;
import com.masai.models.WeatherForcast;

@RestController
@CrossOrigin(origins = "*")
public class WeatherController {

//    @Autowired
//    private WeatherService weatherService;
    @Autowired
    private WeatherService weaS;

    @GetMapping("/forecast-summary/{city}")
    public WeatherForcast getForecastSummary(@PathVariable String city) throws WeatherException {
        return weaS.getForecastSummaryByLocationName(city);
    }

    @GetMapping("/hourly-forecast/{cityName}")
    public String getHourlyForecast(@PathVariable String cityName)throws WeatherException {
        return weaS.getHourlyForecastByLocationName(cityName);
    }
}

