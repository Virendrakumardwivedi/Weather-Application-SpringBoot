package com.masai.models;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WeatherForcast {
	
	@JsonProperty("location")
	private Location location;
	
	@JsonProperty("forecast")
    private Forecast forecast;


}
