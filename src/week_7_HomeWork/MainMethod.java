package week_7_HomeWork;

public class MainMethod {

    //Main method

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Program 1");
        System.out.println("");
        System.out.println("verify number is odd or even ");
        P1_OddEven num1=new P1_OddEven(); //create object
        num1.odd();  //call the instance method in main method via object
        System.out.println("");

        System.out.println("Program 2");
        System.out.println("");
        System.out.println("verify year is Leap year or not");
        P2_LeapYear leap=new P2_LeapYear();  //create object
        leap.leapYear();  //call instance method in main method via object
        System.out.println("");

        System.out.println("Program 3");
        System.out.println("");
        System.out.println("Student Result template");
        P3_StudentResult res = new P3_StudentResult(); //create object
        res.studentresult(); //call instance method in main method via object
        System.out.println("");

        System.out.println("Program 4");
        System.out.println("");
        System.out.println("Find how many days in month");
        System.out.println(P4_DaysInMonth.getDaysInMonth(2,2012)); //call static method via class name
        System.out.println("");

        System.out.println("Program 5");
        System.out.println("");
        System.out.println("Employee salary template");
        P5_EmployeeSalary salary=new P5_EmployeeSalary(); //create object
        salary.employee();  //call instance method via object
        System.out.println("");

        System.out.println("Program 6");
        System.out.println("");
        System.out.println("Find input number is odd or even by if else statement");
        P6_OddEven.even(); //call static method in main method via class name
        System.out.println("");

        System.out.println("Program 7");
        System.out.println("");
        System.out.println("Find sales commission");
        P7_SalesCommission com=new P7_SalesCommission(); //create object
        com.sale(); //call instance method in main method via object
        System.out.println("");

        System.out.println("Program 8");
        System.out.println("");
        System.out.println("Print city name accordingly entered alphabet using if else statement");
        P8_CityFromAlphabetByIfElse.city();   //call static method in main method via class name
        System.out.println("");


        System.out.println("Program 9");
        System.out.println();
        System.out.println("Print city name according entered alphabet using switch statement");
        P9_CityFromAlphabetUsingSwitchCase.city();  //call static method in main method via class name
        System.out.println("");

        System.out.println("Program 10");
        System.out.println();
        System.out.println("Arithmetic operator by if else statement");
        P10_ArithmeticOperator arith=new P10_ArithmeticOperator(); //create object
        arith.arithmetic();   //call instance method in main method via class name
        System.out.println("");

        System.out.println("Program 11");
        System.out.println();
        System.out.println("Number divide by 3 and 5 from 1 to 100 ");
        P11_NumberDivideBy3And5.division(); //call static method in main method via class name
        System.out.println("");

        System.out.println("Program 12");
        System.out.println();
        System.out.println("Input is number,alphabet or symbol ");
        P12_InputCheck input=new P12_InputCheck(); //create object
        input.inputType();  //call instance method in main method via object
        System.out.println("");

        System.out.println("Program 13");
        System.out.println();
        System.out.println("Print name of weekday according to entered number");
        P13_WeekdayName.dayName();  //call static method in main method via class name
        System.out.println("");

        System.out.println("Program 14");
        System.out.println();
        System.out.println("Person's details");
        System.out.println("");

        P14_Person person = new P14_Person();  //create object
        person.setFirstName(""); //firstName is set to empty string
        person.setLastName("");  //lastName is set to empty string
        person.setAge(10);   //age is set to 10
        System.out.println("FullName= " + person.getFullName());  //call getFullName method
        System.out.println("Teen=" + person.isTeen());  //call isTeen method
        person.setFirstName("Nidhi");  //firstName is set to "Nidhi"
        person.setAge(18);   //age is set to 18
        System.out.println("FullName= " + person.getFullName());
        System.out.println("Teen= " + person.isTeen());
        person.setLastName("Lathiya");  //lastName is set to "Lathiya"
        System.out.println("FullName= " + person.getFullName());
        System.out.println("");

        System.out.println("Program 15");
        System.out.println();
        System.out.println("Area of Wall");
        System.out.println("");
        P15_Wall wall = new P15_Wall(5, 4);  //set the width 5 and height 4
        System.out.println("area= " + wall.getArea());  //call getArea method
        wall.setHeight(-1.5);  //set height 0
        System.out.println("width= " + wall.getWidth());  //call getWidth method
        System.out.println("height= " + wall.getHeight()); //call getHeight method
        System.out.println("area= " + wall.getArea());
        System.out.println("");

        System.out.println("Program 16");
        System.out.println();
        System.out.println("Input number is positive,negative or zero");
        P16_NumberCheck numb=new P16_NumberCheck();  //create object
        numb.number();  //call instance method in main method via object
        System.out.println("");

        System.out.println("Program 17");
        System.out.println();
        System.out.println("Sort an array");
        P17_SortArray obj1=new P17_SortArray();
        obj1.sortArray();
        System.out.println("");


        System.out.println("Program 18");
        System.out.println();
        System.out.println("sum of value of an array");
        P18_SumOfArray sum=new P18_SumOfArray();  //create object
        sum.sumArray();  //call sumArray method via object
        System.out.println("");

        System.out.println("Program 19");
        System.out.println();
        System.out.println("Average of value of an array");
        P19_AvgOfArray avg1=new P19_AvgOfArray();  //create object
        avg1.avgArray();  //call avgArray method via object
        System.out.println("");

        System.out.println("Program 20");
        System.out.println();
        System.out.println("Check array contains any specific value?");

        P20_SpecificValueCheck value=new P20_SpecificValueCheck();

        if(value.checkValue()==true){

            System.out.println("Array contains entered value");

        }else{

            System.out.println("Array does not contains entered value");

        }

    }
}
