package com.github.aurelioramos.citiesapi.domain.cities.repositories;

import com.github.aurelioramos.citiesapi.domain.cities.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Long> {
}
