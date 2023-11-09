package com.pizzashop.H2database.model;

import org.springframework.data.annotation.Id;
public class Product {

//    FIELDS
//    @id means id will auto generate
    @Id
    private int id;
    private String name;
    private double price;
    private String serving;
//    CONSTRUCTOR
    public Product(){}
    public Product(String name, double price, String serving){
        this.name = name;
        this.price = price;
        this.serving = serving;
    }

//    GETTERS and SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getServing() {
        return serving;
    }

    public void setServing(String serving) {
        this.serving = serving;
    }

//   METHODS

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", serving='" + serving + '\'' +
                '}';
    }
}
