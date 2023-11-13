package com.pizzashop.H2database.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;

import com.pizzashop.H2database.model.Product;

public interface ProductRepository extends R2dbcRepository<Product, Integer> {
    Flux<Product> findByName(String name);

    // Flux<Product> findByPublished(boolean isPublished);
}
