package Assignments.src;

//import java.util.Scanner;


// 1. Input Number
// 2. Operation enabled
// 3. Looping
// 4. Validation
// 5. If/Else


import jdk.dynalink.Operation;

import java.util.Scanner;

public class MyIoTProject {
    public static void main(String[] args) {
        Scanner Calculator = new Scanner(System.in);

        for (int i = 0; i < 3; i = i + 1) {
            //im gonna loop as long as i is ........
            // for every iteration, im gonna increment i by 1
            System.out.println("First Number: ");
            float First_Number = Calculator.nextFloat();

            System.out.println("Second Number: ");
            float Second_Number = Calculator.nextFloat();

            char Operation='.';

            while (Operation != '+' && Operation != '-' && Operation != '*' && Operation !='/' ){
                //im gonna loop this as long as the entered operation isnt valid
                System.out.println("Operation: ");
                 Operation = Calculator.next().charAt(0);
            }


            float Result = First_Number + Second_Number;
            System.out.println(Result);


            //python if
            //if operation == 'XD' :

            //java if
            //if (operation == 'XD'){......}


                if (Operation == '+') {
                    Result = First_Number + Second_Number;
                } else if (Operation == '-') {
                    Result = First_Number - Second_Number;
                } else if (Operation == '*') {
                    Result = First_Number * Second_Number;
                } else if (Operation == '/') {
                    Result = First_Number / Second_Number;
                }




        }
    }
}
