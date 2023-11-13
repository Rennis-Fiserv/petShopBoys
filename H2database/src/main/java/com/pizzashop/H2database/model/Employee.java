package com.pizzashop.H2database.model;

import org.springframework.data.annotation.Id;

public class Employee {
    // FIELDS
    // @id means id will auto generate

    @Id
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private String employeeRole;

    // CONSTRUCTOR
    public Employee() {
    }

    public Employee(String firstName, String last_name, double salary, String employeeRole) {
        this.firstName = firstName;
        this.lastName = last_name;
        this.salary = salary;
        this.employeeRole = employeeRole;
    }

    // GETTERS and SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last_name) {
        this.lastName = last_name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
    }

    // METHODS

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", last_name=" + lastName + ", salary=" + salary
                + ", employeeRole=" + employeeRole + "]";
    }

}
