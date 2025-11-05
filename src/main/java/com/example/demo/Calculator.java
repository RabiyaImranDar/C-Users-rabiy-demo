package com.example.demo;

public class Calculator {

    public int add(int a , int b){ //
        return a+b;
    }

    public int subtract(int a , int b){
        return a-b;
    }
    public int division(int a , int b){
        if (b==0){
            throw new IllegalArgumentException("Division by zero impossible");
        }
        else
            return a/b;
    }
    public int multiply(int a , int b){
        return a * b;

    }
    public int square(int a ){
        return a * a;

    }

    public double power(double a, double b) {

        return Math.pow(a,b);
    }
}
