package com.codechallenge.weathertracking.service;

import com.codechallenge.weathertracking.dto.WeatherConditionDto;
import com.codechallenge.weathertracking.dto.WeatherRequestDto;

import java.util.List;
import java.util.Optional;

public interface WeatherService {

    Optional<WeatherConditionDto> save(WeatherRequestDto dto);

    Optional<List<WeatherConditionDto>> getByUser(String user);

    Optional<List<WeatherConditionDto>> getByPostalCode(String postalCode);
}
