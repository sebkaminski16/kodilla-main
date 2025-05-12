package com.kodilla.testing.weather.mock;                                     // [1]

import com.kodilla.testing.weather.stub.Temperatures;                         // [2]
import com.kodilla.testing.weather.stub.WeatherForecast;                      // [3]
import org.junit.jupiter.api.Assertions;                                      // [4]
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;                                            // [5]
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.*;                                       // [6]

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {
    @Mock
    private Temperatures temperaturesMock;

    @BeforeEach
    void beforeEach() {
        //Zmiana wartosci aby latwiej bylo obliczyc srednia / medianie w pamieci
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 20.0);
        temperaturesMap.put("Krakow", 30.0);
        temperaturesMap.put("Wroclaw", 10.0);
        temperaturesMap.put("Warszawa", 25.0);
        temperaturesMap.put("Gdansk", 15.0);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }

    @Test                                                                      // [8]
    void testCalculateForecastWithMock() {                                     // [9]
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);// [11]
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();     // [12]

        //Then
        Assertions.assertEquals(5, quantityOfSensors);                          // [13]
    }

    @Test
    public void testCalculateAverageTemperature() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double averageTemperature = weatherForecast.calculateAverageTemperature();

        //Then
        Assertions.assertEquals(20.0, averageTemperature);
    }

    @Test
    public void testCalculateAverageMedian() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double medianTemperature = weatherForecast.calculateMedianTemperature();

        //Then
        Assertions.assertEquals(20.0, medianTemperature);
    }
}