package com.technews;

public class VariablesPractice {
    public static void main(String[] args) {
        int a = 5;
        double b = 6.3;
        String c = "cat";

        double sum = a + b; // summing an int with a double results in a double with decimals
        String concat = a + c; // summing an int with a string results in a concatenated string

        System.out.println(sum);
        System.out.println(concat);
    }
}
