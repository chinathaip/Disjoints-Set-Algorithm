import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your first operand");
        double first_num = reader.nextDouble();
        System.out.println("Enter your second operand");
        double second_num = reader.nextDouble();
        System.out.println("Enter the operation (+,-,*,/)");
        char operation = reader.next().charAt(0);
        System.out.println("Calculation confirmation");
        System.out.println(first_num+" "+operation+" "+second_num);


        //operation support check
        if (operation == '+' || operation == '-' || operation == '*' || operation == '/'){
            System.out.println("Operation supported");
        }else{
            System.out.println("Operation not supported");
        }

        double answer = 0;

// OG method
//        if (operation == '+'){
//            answer = first_num+second_num;
//        }else if(operation == '-'){
//            answer = first_num-second_num;
//        }else if(operation == '*'){
//            answer = first_num*second_num;
//        }else if (operation =='/'){
//            answer = first_num/second_num;
//        }else{
//            answer = -1;
//        }

//        non-noobs method
        switch (operation){
            case '+' :answer = first_num + second_num; break;
            case '-' :answer = first_num - second_num; break;
            case '/' :answer = first_num / second_num; break;
            case '*' :answer = first_num * second_num; break;
            default: answer=-1;

        }
        if(answer == -1){
            System.out.println("ERROR");

        }else {
            System.out.println("The answer is: " + answer);
        }
    }
}
