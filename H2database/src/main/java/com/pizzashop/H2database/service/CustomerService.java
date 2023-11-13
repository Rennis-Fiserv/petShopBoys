package com.pizzashop.H2database.service;

import java.util.Optional;

import com.pizzashop.H2database.model.Customer;
import com.pizzashop.H2database.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Flux<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Flux<Customer> findByName(String first_name) {
        return customerRepository.findByfirstName(first_name);
    }

    public Mono<Customer> findById(int id) {
        return customerRepository.findById(id);
    }

    public Mono<Customer> save(Customer custmoer) {
        return customerRepository.save(custmoer);
    }

    public Mono<Customer> update(int id, Customer Customer) {
        return customerRepository.findById(id)
                .map(Optional::of)
                .defaultIfEmpty(Optional.empty())
                .flatMap(optionalCustomer -> {
                    if (optionalCustomer.isPresent()) {
                        Customer.setId(id);
                        return customerRepository.save(Customer);
                    }
                    return Mono.empty();
                });
    }

    public Mono<Void> deleteById(int id) {
        return customerRepository.deleteById(id);
    }

    public Mono<Void> deleteAll() {
        return customerRepository.deleteAll();
    }

}
