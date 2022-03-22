import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class recursive_printinReverse {
    public static void main (String[] args)throws FileNotFoundException {
        Scanner reader = new Scanner(new File("word.txt"));
        printReverse(reader);

    }


    // recursion will go from the top to the bottom, once it reaches the bottom, it then comes back up
    public static void printReverse(Scanner input){
        if (input.hasNextLine()){ // recursive case : if the file is not empty
            String word = input.nextLine();
            printReverse(input);
            System.out.println(word); // this will be executed once the recursion hits the bottom and starts going back
            //the line after the recursion call will perform as many time as the recursion call occurs
        }
    }
}
