package com.github.aurelioramos.citiesapi.countries.repositories;

import com.github.aurelioramos.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
