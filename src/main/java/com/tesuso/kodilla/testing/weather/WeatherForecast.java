package com.tesuso.kodilla.testing.weather;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAverage() {
        double temperatureSum = 0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            temperatureSum += temperature.getValue();
        }

        return temperatureSum / temperatures.getTemperatures().size();
    }


    public double calculateMedian() {
        List<Double> sortedTemperatures = temperatures.getTemperatures().values().stream().sorted().collect(Collectors.toList());

        if (sortedTemperatures.size() % 2 == 0) {
            return (sortedTemperatures.get((sortedTemperatures.size()-1)/2) + sortedTemperatures.get(sortedTemperatures.size()/2))/2;
        } else {
            return sortedTemperatures.get(sortedTemperatures.size()/2);
        }
    }
}
