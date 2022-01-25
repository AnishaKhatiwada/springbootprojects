package com.project1.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    private int id;
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }

    public void compile(){
        System.out.println("Compiling");
    }
}
