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

import com.pizzashop.H2database.model.Employee;
import com.pizzashop.H2database.service.EmployeeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    @ResponseStatus(HttpStatus.OK)
    public Flux<Employee> getAllProducts(@RequestParam(required = false) String name) {
        if (name == null) {
            return employeeService.findAll();
        } else {
            return employeeService.findByName(name);
        }
    }

    @GetMapping("/employees/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Employee> getProductById(@PathVariable("id") int id) {
        return employeeService.findById(id);
    }

    @PostMapping("/employees")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Employee> createEmployee(@RequestBody Employee employee) {
        return employeeService.save(
                new Employee(
                        employee.getFirst_name(),
                        employee.getLast_name(),
                        employee.getSalary(),
                        employee.getEmployee_role()));
    }

    @PutMapping("/employees/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Employee> updateProduct(@PathVariable("id") int id, @RequestBody Employee employee) {
        return employeeService.update(id, employee);
    }

    @DeleteMapping("/employees/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> deleteProduct(@PathVariable("id") int id) {
        return employeeService.deleteById(id);
    }

    @DeleteMapping("/employees")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> deleteAllProducts() {
        return employeeService.deleteAll();
    }
}
