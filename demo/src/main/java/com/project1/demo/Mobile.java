package com.project1.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
    private int mid;
    private String mbrand;
    @Autowired
    private Laptop laptop;

    public Mobile(){
        System.out.println("Constructor created");
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMbrand() {
        return mbrand;
    }

    public void setMbrand(String mbrand) {
        this.mbrand = mbrand;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
public void show(){
    System.out.println("Method of mobile object is shown.");
    laptop.compile();
}
}
