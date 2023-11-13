package com.pizzashop.H2database.service;

import java.util.Optional;

import com.pizzashop.H2database.model.Employee;
import com.pizzashop.H2database.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Flux<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Flux<Employee> findByfirstName(String firstName) {
        return employeeRepository.findByfirstName(firstName);
    }

    public Mono<Employee> findById(int id) {
        return employeeRepository.findById(id);
    }

    public Mono<Employee> save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Mono<Employee> update(int id, Employee employee) {
        return employeeRepository.findById(id)
                .map(Optional::of)
                .defaultIfEmpty(Optional.empty())
                .flatMap(optionalEmployee -> {
                    if (optionalEmployee.isPresent()) {
                        employee.setId(id);
                        return employeeRepository.save(employee);
                    }
                    return Mono.empty();
                });
    }

    public Mono<Void> deleteById(int id) {
        return employeeRepository.deleteById(id);
    }

    public Mono<Void> deleteAll() {
        return employeeRepository.deleteAll();
    }

}
