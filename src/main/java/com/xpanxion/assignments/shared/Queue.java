package com.xpanxion.assignments.shared;

import java.util.ArrayList;

public class Queue {
    ArrayList<Node> nodeList;

    public Queue() {
        this.nodeList = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.nodeList.size() == 0;
    }

    // pop the first element in
    public Node dequeue() {
        Node tempNode = this.nodeList.get(0);
        if (!isEmpty()) {
            this.nodeList.remove(0);
            return tempNode;
        }
        return tempNode;

    }

    public void enqueue(Node node) {
        this.nodeList.add(node);
        return;
    }

    public String toString() {
        String result = String.format("%s", this.nodeList);
        return result;
    }

}