package org.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        double number1;
        double number2;
        int operator;
        double answer;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Lel's first attempt at a calculator.");
        System.out.println("Please enter a random number to begin.");
        number1 = sc.nextDouble();
        System.out.println("Now enter the second number to continue.");
        number2 = sc.nextDouble();
        System.out.println("Please select an option.");
        System.out.println("<---)  1.Addition  2.Subtraction  3.Multiplication  4.Division  (--->");
        operator = sc.nextInt();

        switch (operator) {

            //addition
            case 1 -> {
                answer = number1 + number2;
                System.out.println("Addition result = " + answer);
            }

            //subtraction
            case 2 -> {
                answer = number1 - number2;
                System.out.println("Subtraction result = " + answer);
            }

            //multiplication
            case 3 -> {
                answer = number1 * number2;
                System.out.println("Multiplication result = " + answer);
            }

            //division
            case 4 -> {
                answer = number1 / number2;
                System.out.println("Division result = " + answer);
            }

            //if none of the 4 options are chosen
            default -> throw new Exception("Invalid option, please try again.");
        }

    }
}
