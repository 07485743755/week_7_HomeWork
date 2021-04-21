package week_7_HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P17_SortArray {

   // 17. Write a Java program to sort a numeric array and a string array.

    public void sortArray(){

        int num[]={23,98,65,49,73,26,69,9,4,7};

        String str[]={"class","object","constructor","method","variable","encapsulation","polymorphism"};

        Arrays.sort(num);  //sort in ascending order
        System.out.println("Sort numeric array in ascending order: "+Arrays.toString(num));

        Arrays.sort(str); //sort String in ascending
        System.out.println("Sort string  array in ascending order: "+Arrays.toString(str));


       // Arrays.sort(num, Collections.reverseOrder());
        //System.out.println(" Collection.sort()  :\n" + colList);*/

    }

}
