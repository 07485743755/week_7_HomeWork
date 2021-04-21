package week_7_HomeWork;

import java.util.Scanner;

public class P12_InputCheck {

    //12. Write a program that tells us input value is number or an alphabet or symbol

    //Instance method
    public void inputType() {

        char a;  //Local variable

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any input to check whether it is number,alphabet or symbol: ");
        a = input.next().charAt(0);

        if (a >= 65 && a <= 90 || a >= 97 && a <= 122) {

            System.out.println("Input character " + a + " is alphabet");

        } else if (a >= 48 && a <= 57) {

            System.out.println("Input character is number");

        } else {

            System.out.println("Input character " + a + " is symbol");
        }
    }

}
