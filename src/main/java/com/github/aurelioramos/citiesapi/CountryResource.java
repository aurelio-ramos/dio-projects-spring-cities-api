package com.github.aurelioramos.citiesapi;

import com.github.aurelioramos.citiesapi.domain.countries.entities.Country;
import com.github.aurelioramos.citiesapi.domain.countries.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    //@Autowired //injeção pode ser usada no lugar do construtor
    private CountryRepository repository;

    public CountryResource(CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Country> countries() {
        return repository.findAll();
    }
}
