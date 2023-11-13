package com.pizzashop.H2database.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;

import com.pizzashop.H2database.model.Customer;

public interface CustomerRepository extends R2dbcRepository<Customer, Integer> {
    Flux<Customer> findByfirstName(String firstName);

    // Flux<Customer> findByPublished(boolean isPublished);
}
