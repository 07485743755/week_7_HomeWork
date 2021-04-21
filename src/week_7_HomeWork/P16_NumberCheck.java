package week_7_HomeWork;

import java.util.Scanner;

public class P16_NumberCheck {

    //16.Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”

    long num; //Global variable

    //Instance method
    public void number(){

        Scanner num1=new Scanner(System.in); //create object
        System.out.println("Enter the number:");
        num=num1.nextLong();

        if(num<0){

            System.out.println(num+" is negative number");
        }else if (num>0){

            System.out.println(num+" is positive number");

        }else{
            System.out.println("Number is zero");
        }
    }

}
