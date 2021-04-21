package week_7_HomeWork;

import java.util.Scanner;

public class P6_OddEven {

    //6. Write a java program to input any number and find out if it’s odd or even

    //static method
    public static void even() {
        int num;  //Local variable

        Scanner numb = new Scanner(System.in); //create object
        System.out.print("Enter input number:  ");
        num = numb.nextInt();

        //Logic for odd even
        if (num % 2 == 0) {

            System.out.println(num + " is a even number");

        } else {

            System.out.println(num + " is a odd number");

        }
    }
}
