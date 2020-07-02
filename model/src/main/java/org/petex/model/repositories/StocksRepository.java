package org.petex.model.repositories;

import org.petex.model.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StocksRepository extends JpaRepository<Stock, Long> {
}
