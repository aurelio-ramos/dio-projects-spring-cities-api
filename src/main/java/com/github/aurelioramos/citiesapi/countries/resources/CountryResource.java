package com.github.aurelioramos.citiesapi.countries.resources;

import com.github.aurelioramos.citiesapi.countries.entities.Country;
import com.github.aurelioramos.citiesapi.countries.repositories.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    //@Autowired //injeção pode ser usada no lugar do construtor
    private CountryRepository repository;

    public CountryResource(CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Page<Country> countries(Pageable page) {
        return repository.findAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity getOne(@PathVariable Long id) {
        var optionalCountry = repository.findById(id);
        if(optionalCountry.isPresent()){
            return ResponseEntity.ok().body(optionalCountry.get());
        }
        return ResponseEntity.notFound().build();
    }
}
