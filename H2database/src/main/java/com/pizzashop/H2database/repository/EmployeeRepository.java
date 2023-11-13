package com.pizzashop.H2database.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;

import com.pizzashop.H2database.model.Employee;

public interface EmployeeRepository extends R2dbcRepository<Employee, Integer> {
    Flux<Employee> findByfirstName(String firstName);

    // Flux<Employee> findByPublished(boolean isPublished);
}
