package com.xpanxion.assignments.shared;

import java.util.ArrayList;

public class Calculator {

    public ArrayList<String> history;

    public Calculator() {
        this.history = new ArrayList<>();
    }

    public void addStatement(String statement) {
        this.history.add(statement);
    }

    // have this function do the case switching and then add it to the list
    public String processStatement(int digit1, int digit2, String operation) {
        int res;
        switch (operation) {
            // convert res to an appropriate string
            case "add" -> {
                res = digit1 + digit2;
                String strResult = String.format("Result: %d", res);
                String statement = String.format("%d + %d = %d", digit1, digit2, res);
                addStatement(statement);
                return strResult;
            }
            case "sub" -> {
                res = digit1 - digit2;
                String strResult = String.format("Result: %d", res);
                String statement = String.format("%d - %d = %d", digit1, digit2, res);
                addStatement(statement);
                return strResult;
            }
            case "mul" -> {
                res = digit1 * digit2;
                String strResult = String.format("Result: %d", res);
                String statement = String.format("%d * %d = %d", digit1, digit2, res);
                addStatement(statement);
                return strResult;
            }
            case "div" -> {
                res = digit1 / digit2;
                String strResult = String.format("Result: %d", res);
                String statement = String.format("%d / %d = %d", digit1, digit2, res);
                addStatement(statement);
                return strResult;
            }
            default -> {
                System.out.println("hit");
                return "hi";
            }
        }
    }

    // once user hits done, call this function to output everything
    public void showStatements() {
        for (String line : this.history) {
            System.out.println(line);
        }
        return;
    }
}