import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class FileApp {
     /*
            when to use throws and try/catch
            - use "throws" when you want the program to stop when an error occurs
            - use "try/catch" when you want the user to re-input the program
     */
    public static void main (String[] args) throws FileNotFoundException {//state that the error might happen if the file could not be located
        Scanner reader = new Scanner(new File("word.txt"));
        PrintStream output = new PrintStream(new File("word_edited.txt"));
        while(reader.hasNextLine()){// check how many more lines left
            String line = reader.nextLine(); // return the line
            remove_extra_spaces(line,output); // remove space
            remove_extra_spaces(line,System.out); // *not necessary* just for showing results in IntelliJ
        }
    }


    public static void remove_extra_spaces(String text,PrintStream output){
        Scanner reader = new Scanner(text); //
        if (reader.hasNext()){/// check inside a line
            output.print(reader.next()); // print the first word
            while(reader.hasNext()){ // if more words in line, keep printing
                output.print(" "+reader.next());
            }
        }
        output.print("\n");// if no more words in the line, create a new line
        output.close();
    }




}
