package com.xpanxion.assignments.shared;

public class Node {
    public Cat data;
    public Node next;

    public Node(Cat data) {
        this.data = data;
    }

    public String toString() {
        String result = String.format("%s", this.data);
        return result;
    }
}
