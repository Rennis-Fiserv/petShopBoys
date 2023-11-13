package com.pizzashop.H2database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pizzashop.H2database.model.Customer;
import com.pizzashop.H2database.service.CustomerService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    CustomerService CustomerService;

    @GetMapping("/customers")
    @ResponseStatus(HttpStatus.OK)
    public Flux<Customer> getAllCustomers(@RequestParam(required = false) String name) {
        if (name == null) {
            return CustomerService.findAll();
        } else {
            return CustomerService.findByName(name);
        }
    }

    @GetMapping("/customers/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Customer> getCustomerById(@PathVariable("id") int id) {
        return CustomerService.findById(id);
    }

    @PostMapping("/customers")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Customer> createCustomer(@RequestBody Customer Customer) {
        return CustomerService.save(
                new Customer(
                        Customer.getFirstName(),
                        Customer.getlastName(),
                        Customer.getphoneNumber()));
    }

    @PutMapping("/customers/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Customer> updateCustomer(@PathVariable("id") int id, @RequestBody Customer Customer) {
        return CustomerService.update(id, Customer);
    }

    @DeleteMapping("/customers/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> deleteCustomer(@PathVariable("id") int id) {
        return CustomerService.deleteById(id);
    }

    @DeleteMapping("/customers")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> deleteAllCustomers() {
        return CustomerService.deleteAll();
    }
}
