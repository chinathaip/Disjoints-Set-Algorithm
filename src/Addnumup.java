import java.util.Scanner;

public class Addnumup {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int counter = 0;
        int sum_total = 0;
        System.out.println("\tEnter an interger (-1 to exit the program):");
        int userinput = reader.nextInt();
        while (userinput!=-1){
            sum_total= sum_total+userinput;
            counter++;
            System.out.println("\tEnter an interger (-1 to exit the program):");
            userinput= reader.nextInt();
        }
        System.out.println("Sum = "+sum_total);
        System.out.println("You've entered "+counter+" numbers");
    }



}
