package week_7_HomeWork;

import java.util.Scanner;  //import Scanner class

public class P2_LeapYear {
    /*2. Write a java program to input any year like (ex.2007) and
     find out if it is leap year or not?  */

    int year;  //Instance variable

    //Instance method
    public void leapYear() {
        int result;

        Scanner yr = new Scanner(System.in);  //create object
        System.out.println("Enter the year: ");
        year = yr.nextInt();

        //Logic for check leap year
        //result = year % 4;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

            System.out.println("Given year is Leap year");

        } else {

            System.out.println("Given year is not Leap year");
        }

    }


}
