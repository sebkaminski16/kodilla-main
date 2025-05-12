package com.kodilla.testing.weather.stub;

import java.util.*;

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

    public double calculateAverageTemperature() {
        Collection<Double> allTemperatures = temperatures.getTemperatures().values();
        double temperaturesSum = 0;
        for(Double temperature : allTemperatures) {
            temperaturesSum += temperature;
        }
        return temperaturesSum / temperatures.getTemperatures().size();
    }

    public double calculateMedianTemperature() {
        Collection<Double> allTemperatures = temperatures.getTemperatures().values();
        ArrayList<Double> sortedTemperatures = new ArrayList<>();
        for(Double temperature : allTemperatures) {
            sortedTemperatures.add(temperature);
        }
        Collections.sort(sortedTemperatures);
        if(sortedTemperatures.size() % 2 == 0) {
            double firstElement = sortedTemperatures.get((int)Math.floor(sortedTemperatures.size() / 2));
            double secondElement = sortedTemperatures.get((int)Math.ceil(sortedTemperatures.size() / 2)) ;
            return (firstElement + secondElement) / 2;
        } else {
            return sortedTemperatures.get((int)Math.ceil(sortedTemperatures.size() / 2));
        }
    }
}