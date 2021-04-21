package week_7_HomeWork;

import java.util.Scanner; //Import Scanner class

public class P1_OddEven {

    /*1. Write a java program that tells us that Input number is odd or even?
    HINT: use ternary operator (? :)*/

    int inputNum;  //Instance variable

    //Instance Method

    public void odd() {
        String result;  //Local variable
        Scanner input = new Scanner(System.in); //create object
        System.out.println("Enter the value for input number: ");
        inputNum = input.nextInt();

        //Logic to check odd even number
        result = (inputNum % 2 == 0) ? "Given number is Even" : "Given number is Odd";
        System.out.println(result);
    }

}
