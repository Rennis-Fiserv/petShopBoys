package com.pizzashop.H2database.model;

import org.springframework.data.annotation.Id;

public class Customer {
    // FIELDS
    // @id means id will auto generate

    @Id
    private int id;
    private String first_name;
    private String last_name;
    private int phone_number;

    // CONSTRUCTOR
    public Customer() {
    }

    public Customer(String first_name, String last_name, int phone_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
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

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    // METHODS

    @Override
    public String toString() {
        return "Customer [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", phone_number="
                + phone_number + "]";
    }

}