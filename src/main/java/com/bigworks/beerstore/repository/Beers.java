package com.bigworks.beerstore.repository;

import com.bigworks.beerstore.model.Beer;
import com.bigworks.beerstore.model.BeerType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Beers  extends JpaRepository<Beer, Long> {

    Optional<Beer> findByNameAndType(String name, BeerType type);
}
