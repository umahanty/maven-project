package com.mentorbaba.project;

import java.util.Scanner;

public class App{
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter your choice: ");
        int operation = scanner.nextInt();

        if (operation == 1) {
            result = num1 + num2;
        } else if (operation == 2) {
            result = num1 - num2;
        } else if (operation == 3) {
            result = num1 * num2;
        } else if (operation == 4) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero!");
                return;
            }
        } else {
            System.out.println("Invalid operation!");
            return;
        }
        System.out.println("Result: " + result);

        scanner.close();
    }
}
