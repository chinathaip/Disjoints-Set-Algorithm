import java.util.Random;
import java.util.Scanner;

public class GuessNum {

    public static int counter=0;

    public static void hint(int random_num, int user_guess){
        if (random_num/10 ==user_guess/10   // first == first   (example: 92/10 = 9   97/10 = 9)
        || random_num%10 == user_guess%10   // second == second (example: 92%10 = 2   72%10 = 2)
        || random_num/10 == user_guess%10   // first == second  (example: 92/10 = 9   29%10 = 9)
        || random_num%10 == user_guess/10   // second == first  (example: 92%10 = 2   29/10 = 2)
        ){
            System.out.println("One of the digit is correct");

        }
        if(random_num>user_guess){  // random is higher than guess
            System.out.println("Your number is too low");

        }else{
            System.out.println("Your number is too high");

        }
        System.out.println("---------------------------");
    }

    public static int getInt(Scanner reader){
        while (!reader.hasNextInt()){
            reader.next();
            System.out.println("Not an integer, enter again: ");

        }
        return reader.nextInt();
    }

    public static int getGuess(Scanner reader){
        System.out.println("Guess a number (0-99): ");
        int user_guess = getInt(reader);
        while(user_guess<0 || user_guess>99){
            System.out.println("Out of range, enter again: ");

            user_guess=getInt(reader);

        }
        return user_guess;
    }

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        Random rand = new Random(); //create an object for randomizing called "rand"
        int random_num = rand.nextInt(100); //random an integer from 0-99

//        System.out.println(random_num); //test

        int user_guess = getGuess(reader); // different from the user_guess in getGuess()
        counter++;


        while(user_guess!=random_num){
            System.out.println("Not quite.. BUT:");
            System.out.println(" ");
            hint(random_num,user_guess);
            user_guess=getGuess(reader);
            counter++;
        }
        System.out.println("You got it right in "+counter+" time(s)");
    }
}
