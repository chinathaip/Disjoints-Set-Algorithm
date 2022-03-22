import java.util.Random;
import java.util.Scanner;

public class DiceSum {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Desired dice sum?: ");
        int desired_sum = reader.nextInt();
        int sum_2dices;
        int counter=0;

        do{
            int dice1 = rand.nextInt(6)+1;   // +1 excludes 0 and includes 6
            int dice2 = rand.nextInt(6)+1;
            System.out.println("Dice 1 : "+dice1+" Dice 2: "+dice2);
            sum_2dices = dice1+dice2;
            counter++;
        }while (desired_sum!= sum_2dices);
        System.out.println("It took "+counter+" times to roll the dice and get the desired dice sum");




    }
}
