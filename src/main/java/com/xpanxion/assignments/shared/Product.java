package com.xpanxion.assignments.shared;

public class Product extends Base {
    // has id, name, and cost
    // public int id;
    public String name;
    public double cost;

    // constructor looks like: 111,"Mustard",2.00
    public Product(int id, String name, double cost) {
        super(id);
        this.name = name;
        this.cost = cost;
    }

}