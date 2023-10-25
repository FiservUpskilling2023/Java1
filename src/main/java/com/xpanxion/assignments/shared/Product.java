package com.xpanxion.assignments.shared;

public class Product {
    // has id, name, and cost
    public int id;
    public String name;
    public double cost;

    // constructor looks like: 111,"Mustard",2.00
    public Product(int id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

}