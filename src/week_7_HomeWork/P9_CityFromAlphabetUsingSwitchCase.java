package week_7_HomeWork;

import java.util.Scanner;

public class P9_CityFromAlphabetUsingSwitchCase {

    //9.Input any alphabet from “A" to “F” and print their city name accordingly (use switch statement)
    //  if any other alphabet should be invalid entry


    public static void city() {

        char x;  //Local variable

        Scanner alpha = new Scanner(System.in);  //create object
        System.out.print("Enter the alphabet: ");
        x = alpha.next().charAt(0);

        //switch statement

        switch (x) {

            case 'a':

                System.out.println("Aberdeen");
                break;

            case 'b':

                System.out.println("Birmingham");
                break;

            case 'c':

                System.out.println("Cambridge");
                break;

            case 'd':

                System.out.println("Derby");
                break;

            case 'e':

                System.out.println("Edinburgh");
                break;

            case 'f':

                System.out.println("Fairford");
                break;

            default:

                System.out.println("Invalid entry");
                break;


        }


    }
}
