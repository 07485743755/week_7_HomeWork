package week_7_HomeWork;

import java.util.Scanner;

public class P10_ArithmeticOperator {

    // 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
    // /, *) find addition, Subtraction, multiplication and division according to their symbol
    // (using if else)

    //Instance method
    public void arithmetic() {

        double first, second;  //Local variable
        char operator;  //Local variable

        Scanner num = new Scanner(System.in); //create object

        System.out.print("Enter the first number: ");
        first = num.nextDouble();

        System.out.print("Enter the second number: ");
        second = num.nextDouble();

        System.out.print("Enter the operator: ");
        operator = num.next().charAt(0);


        //if else statement

        if (operator == '+') {

            System.out.println("Addition of " + first + "  + " + second + " is = " + (first + second));

        } else if (operator == '-') {

            System.out.println("Subtraction of " + first + " - " + second + " is = " + (first - second));

        } else if (operator == '*') {

            System.out.println("Multiplication of " + first + " * " + second + " is = " + (first * second));

        } else if (operator == '/') {

            System.out.println("Division of " + first + " / " + second + "  is = " + (first / second));

        } else {

            System.out.println("Invalid Operator");

        }
    }
}