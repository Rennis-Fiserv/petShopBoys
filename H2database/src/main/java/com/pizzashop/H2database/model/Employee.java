package com.pizzashop.H2database.model;

import org.springframework.data.annotation.Id;

public class Employee {
    // FIELDS
    // @id means id will auto generate

    @Id
    private int id;
    private String first_name;
    private String last_name;
    private double salary;
    private String employee_role;

    // CONSTRUCTOR
    public Employee() {
    }

    public Employee(String first_name, String last_name, double salary, String employee_role) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.salary = salary;
        this.employee_role = employee_role;
    }

    // GETTERS and SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmployee_role() {
        return employee_role;
    }

    public void setEmployee_role(String employee_role) {
        this.employee_role = employee_role;
    }

    // METHODS

    @Override
    public String toString() {
        return "Employee [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", salary=" + salary
                + ", employee_role=" + employee_role + "]";
    }

}
