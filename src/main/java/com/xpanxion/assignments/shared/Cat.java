package com.xpanxion.assignments.shared;

public class Cat {
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    public String toString() {
        String result = String.format("{name='%s'}", name);
        return result;
    }
}