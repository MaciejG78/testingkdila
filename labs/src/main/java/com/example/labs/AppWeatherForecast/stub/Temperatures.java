package com.example.labs.AppWeatherForecast.stub;

import java.util.Map;

public interface Temperatures {

    //first element of the map is an identifier of weather station
    //second element of the map is a temperature in Celsius degrees
    Map<String, Double> getTemperatures();

}
