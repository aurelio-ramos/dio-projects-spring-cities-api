package com.github.aurelioramos.citiesapi.states.repositories;

import com.github.aurelioramos.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}