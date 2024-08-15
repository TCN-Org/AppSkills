package com.example.teju.tutorial;
public class Calculator {

    // Method to add two numbers
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to subtract two numbers
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method to multiply two numbers
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method to divide two numbers
    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition: " + calc.add(5, 3));
        System.out.println("Subtraction: " + calc.subtract(5, 3));
        System.out.println("Multiplication: " + calc.multiply(5, 3));
        System.out.println("Division: " + calc.divide(5, 3));
    }
}
