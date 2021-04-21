package week_7_HomeWork;

import java.util.Scanner;

public class P8_CityFromAlphabetByIfElse {

    //8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
    //if any other alphabet should be invalid entry

    public static void city() {

        char x;  //Local variable

        Scanner alpha = new Scanner(System.in);  //create object
        System.out.print("Enter the alphabet: ");
        x = alpha.next().charAt(0);

        //if else statement

        if (x == 'a' || x == 'A') {

            System.out.println("Aberdeen");

        } else if (x == 'b' || x == 'B') {

            System.out.println("Birmingham");

        } else if (x == 'c' || x == 'C') {

            System.out.println("Cambridge");

        } else if (x == 'd' || x == 'D') {

            System.out.println("Derby");

        } else if (x == 'e' || x == 'E') {

            System.out.println("Edinburgh");

        } else if (x == 'f' || x == 'F') {

            System.out.println("Fairford");

        } else {

            System.out.println("Invalid entry");
        }

    }

}
