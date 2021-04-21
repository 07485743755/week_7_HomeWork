package week_7_HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class P18_SumOfArray {

    //18. Write a Java program to sum values of an array.

    int num[],length;

    public void sumArray() {

        int sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        length=input.nextInt();
       int  num[]=new int[length];
        System.out.println("Enter the value for array: ");

        for(int i=0;i<length;i++){

            num[i]=input.nextInt();
             sum=sum+num[i];  //Logic for sum of array

        }
        System.out.println(Arrays.toString(num));
        System.out.println("Sum of value of an array is = "+sum);

    }

}
