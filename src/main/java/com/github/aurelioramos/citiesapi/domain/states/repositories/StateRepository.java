package com.github.aurelioramos.citiesapi.domain.states.repositories;

import com.github.aurelioramos.citiesapi.domain.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}