package com.github.aurelioramos.citiesapi.domain.countries.repositories;

import com.github.aurelioramos.citiesapi.domain.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
