package week_7_HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class P20_SpecificValueCheck {

    //20. Write a Java program to test if an array contains a specific value


    public boolean checkValue() {

        int length, checkValue1;  //Local variable


        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        length = input.nextInt();
        int num[] = new int[length];

        System.out.println("Enter the value for array: ");

        for (int i = 0; i < length; i++) {

            num[i] = input.nextInt();

        }

        System.out.println(Arrays.toString(num));

        System.out.println("Enter the value for check");
        checkValue1 = input.nextInt();

        for (int n : num) {

            if (checkValue1 == n) {

                return true;

            }

        }
        return false;

    }

}