/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathapp;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MathApp {

    // Method for validated integer input
    public static int getInt(Scanner input, String message) {
        while (true) {
            System.out.print(message);

            if (input.hasNextInt()) {
                return input.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                input.next(); // discard invalid input
            }
        }
    }

    // Method for validated double input
    public static double getDouble(Scanner input, String message) {
        while (true) {
            System.out.print(message);

            if (input.hasNextDouble()) {
                return input.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                input.next(); // discard invalid input
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Math App Menu ===");
            System.out.println("1. Addition of two numbers");
            System.out.println("2. Subtraction of two numbers");
            System.out.println("3. Multiplication of two numbers");
            System.out.println("4. Division of two numbers");
            System.out.println("5. Factorial of a number");
            System.out.println("6. Power (x^y)");
            System.out.println("7. Sum of numbers 1 to N");
            System.out.println("8. Check if a number is prime");
            System.out.println("9. Greatest Common Divisor (GCD)");
            System.out.println("10. Absolute value of a number");
            System.out.println("11. Average of N numbers");
            System.out.println("12. Maximum of N numbers");
            System.out.println("0. Exit");

            choice = getInt(input, "Enter your choice: ");

            switch (choice) {

                case 1:
                    double a = getDouble(input, "Enter first number: ");
                    double b = getDouble(input, "Enter second number: ");

                    System.out.println("Result: " + (a + b));
                    break;

                case 2:
                    a = getDouble(input, "Enter first number: ");
                    b = getDouble(input, "Enter second number: ");

                    System.out.println("Result: " + (a - b));
                    break;

                case 3:
                    a = getDouble(input, "Enter first number: ");
                    b = getDouble(input, "Enter second number: ");

                    System.out.println("Result: " + (a * b));
                    break;

                case 4:
                    a = getDouble(input, "Enter first number: ");
                    b = getDouble(input, "Enter second number: ");

                    if (b == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + (a / b));
                    }
                    break;

                case 5:
                    int n = getInt(input, "Enter a number: ");

                    if (n < 0) {
                        System.out.println("Error: Factorial cannot be negative.");
                    } else {
                        long factorial = 1;

                        for (int i = 1; i <= n; i++) {
                            factorial *= i;
                        }

                        System.out.println("Factorial: " + factorial);
                    }
                    break;

                case 6:
                    a = getDouble(input, "Enter base (x): ");
                    int exponent = getInt(input, "Enter exponent (y): ");

                    System.out.println("Result: " + Math.pow(a, exponent));
                    break;

                case 7:
                    n = getInt(input, "Enter N: ");

                    if (n < 1) {
                        System.out.println("Error: N must be at least 1.");
                    } else {
                        int sum = 0;

                        for (int i = 1; i <= n; i++) {
                            sum += i;
                        }

                        System.out.println("Sum from 1 to " + n + ": " + sum);
                    }
                    break;

                case 8:
                    n = getInt(input, "Enter a number: ");

                    if (n < 2) {
                        System.out.println(n + " is not a prime number.");
                    } else {
                        boolean prime = true;

                        for (int i = 2; i <= Math.sqrt(n); i++) {
                            if (n % i == 0) {
                                prime = false;
                                break;
                            }
                        }

                        if (prime) {
                            System.out.println(n + " is a prime number.");
                        } else {
                            System.out.println(n + " is not a prime number.");
                        }
                    }
                    break;

                case 9:
                    int num1 = getInt(input, "Enter first number: ");
                    int num2 = getInt(input, "Enter second number: ");

                    int x = Math.abs(num1);
                    int y = Math.abs(num2);

                    while (y != 0) {
                        int temp = y;
                        y = x % y;
                        x = temp;
                    }

                    System.out.println("GCD: " + x);
                    break;

                case 10:
                    a = getDouble(input, "Enter a number: ");

                    System.out.println("Absolute value: " + Math.abs(a));
                    break;

                case 11:
                    n = getInt(input, "Enter how many numbers: ");

                    if (n <= 0) {
                        System.out.println("Error: N must be greater than 0.");
                    } else {
                        double[] numbers = new double[n];
                        double total = 0;

                        for (int i = 0; i < n; i++) {
                            numbers[i] = getDouble(
                                    input,
                                    "Enter number " + (i + 1) + ": "
                            );
                            total += numbers[i];
                        }

                        double average = total / n;

                        System.out.println("Average: " + average);
                    }
                    break;

                case 12:
                    n = getInt(input, "Enter how many numbers: ");

                    if (n <= 0) {
                        System.out.println("Error: N must be greater than 0.");
                    } else {
                        double[] numbers = new double[n];

                        for (int i = 0; i < n; i++) {
                            numbers[i] = getDouble(
                                    input,
                                    "Enter number " + (i + 1) + ": "
                            );
                        }

                        double maximum = numbers[0];

                        for (int i = 1; i < n; i++) {
                            if (numbers[i] > maximum) {
                                maximum = numbers[i];
                            }
                        }

                        System.out.println("Maximum: " + maximum);
                    }
                    break;

                case 0:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println(
                            "Invalid choice. Please select 0-12."
                    );
            }

        } while (choice != 0);

        
    }
}
