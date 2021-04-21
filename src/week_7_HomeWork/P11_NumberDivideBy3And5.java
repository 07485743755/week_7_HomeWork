package week_7_HomeWork;

public class P11_NumberDivideBy3And5 {

    //11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
    //and 5 separately.


    //Static method
    public static void division() {

        int index = 0, index1 = 0;  //Local variable

        int three[] = new int[50];  //declare array
        int five[] = new int[50];  //declare array

        //Logic for divide by 3
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0) {

                three[index] = i;
                index++;
            }

        }
        //Logic for divide by 5
        for (int i = 1; i <= 100; i++) {

            if (i % 5 == 0) {

                five[index1] = i;
                index1++;
            }
        }

        //print above result side by side
        for(int i=0;i< three.length;i++){


            if(three[i]!=0&&five[i]!=0){

                System.out.println(three[i] + "  " + five[i]);

            }else {

                if(three[i]!=0) {

                    System.out.println(three[i]);
                }
            }
        }
    }


}
