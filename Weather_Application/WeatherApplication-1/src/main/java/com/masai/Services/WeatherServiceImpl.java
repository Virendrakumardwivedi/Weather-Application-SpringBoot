package com.masai.Services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.masai.models.WeatherForcast;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Value("${rapidapi.host}")
    private String rapidApiHost;

    @Value("${rapidapi.key}")
    private String rapidApiKey;
    
    @Value("${rapidapi2.host}")
    private String rapidApiHost2;
    
    
    
    @Override
    public WeatherForcast getForecastSummaryByLocationName(String cityName) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-rapidapi-host", rapidApiHost);
        headers.set("x-rapidapi-key", rapidApiKey);
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<WeatherForcast> entity = new HttpEntity<>(headers);

      // UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://forecast9.p.rapidapi.com/rapidapi/forecast/" + cityName + "/summary/");
        String Url = "https://forecast9.p.rapidapi.com/rapidapi/forecast/"+cityName+"/summary/";
        ResponseEntity<WeatherForcast> response = new RestTemplate().exchange(
        		Url,
        		//builder
                HttpMethod.GET,
                entity,
                WeatherForcast.class
        );

        return response.getBody();
    }

    @Override
    public String getHourlyForecastByLocationName(String cityName) {
      

        String url = "https://api.openweathermap.org/data/2.5/weather?q="+cityName+"&appid="+rapidApiHost2;
                

        String response = new RestTemplate().getForObject(url, String.class );

        return response;
    }
}
