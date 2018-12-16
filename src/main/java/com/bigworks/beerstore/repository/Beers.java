package com.bigworks.beerstore.repository;

import com.bigworks.beerstore.model.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Beers  extends JpaRepository<Beer, Long> {
}
