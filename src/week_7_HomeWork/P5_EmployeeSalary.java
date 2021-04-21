package week_7_HomeWork;

import java.util.Scanner;

public class P5_EmployeeSalary {
    /*
    5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
    salary
     HRA = basic salary 10%
     DA = Basic salary 8%
     TA = Basic salary 9%
     PF= Basic salary 20%
     Gross salary = basic salary + HRA + TA + DA –PF
    Print in following format
     _______________________________
    |       Salary Slip            |
    |______________________________|
    | Employee Id   : 2564         |
    | Employee Name : Jay          |
    |______________________________|
    | Basic Salary  : 25000.0      |
    | HRA 10%       : 2500.0       |
    | TA 8%         : 2250.0       |
    | DA 9%         : 2000.0       |
    | PF - 20&      : 5000.0       |
    |______________________________|
    | Gross Salary  : 26750.0      |
    |==============================|    */

    String employeeName;
    int employeeId;
    double basicSalary, hra, ta, da, pf, grossSalary;

    public void employee() {

        String str = " ______________________________ ";
        String addstr = "|       Salary Slip            |";
        String addstr1 = "|______________________________|";
        String addstr2 = "|==============================|";

        Scanner emp = new Scanner(System.in);  //create object
        System.out.println(str);
        System.out.println(addstr);
        System.out.println(addstr1);
        System.out.print("| Employee Id   : ");
        employeeId = emp.nextInt();
        System.out.print("| Employee Name : ");
        employeeName = emp.next();
        System.out.println(addstr1);
        System.out.print("| Basic Salary  : ");
        basicSalary = emp.nextDouble();

        hra = basicSalary * 10 / 100;
        ta = basicSalary * 8 / 100;
        da = basicSalary * 9 / 100;
        pf = basicSalary * 20 / 100;
        grossSalary = basicSalary + hra + ta + da - pf;
        System.out.println("| HRA 10%       : " + hra + "       |");
        System.out.println("| TA 8%         : " + ta + "       |");
        System.out.println("| DA 9%         : " + da + "       |");
        System.out.println("| PF - 20&      : " + pf + "       |");
        System.out.println(addstr1);
        System.out.println("| Gross Salary  : " + grossSalary + "      |");
        System.out.println(addstr2);

    }

}
