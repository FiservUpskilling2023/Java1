package com.xpanxion.assignments.shared;

import java.util.ArrayList;

// extend the parent
public class Invoice extends Base {
    // has id member
    // has PRIVATE list of Products
    // method for addProudct(product obj)
    // public int id;
    private ArrayList<Product> products;

    // use the superclass constructor id in the constructor for the child
    public Invoice(int id) {
        super(id);
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public double getTotalCost() {
        double sum = 0.0;
        for (Product item : products) {
            sum += item.cost;
        }
        return sum;
    }
}