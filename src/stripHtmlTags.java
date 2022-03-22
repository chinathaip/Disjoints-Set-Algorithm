import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;


public class stripHtmlTags {


    public static void main (String[] args) throws FileNotFoundException {//state that the error might happen if the file could not be located
        Scanner reader = new Scanner(new File("mywebv2.txt"));
        removehtmltag(reader);

    }
//



    public static void removehtmltag(Scanner input) { // should go character by character
        while (input.hasNextLine()) {
            String line = input.nextLine();//get line
            while(line.indexOf("<")>=0 ||  line.indexOf(">")>=0){  // if it exists


                //remove the < at index X,
                // substring upto that index X,  (from start to <)
                // then substring the rest of the string (after >)

                line = line.substring(0,line.indexOf("<"))+line.substring(line.indexOf(">")+1);
                // print from the start(0) until where the < is, then ignore what is inside, then print from the end of >
            }
            System.out.print(line);
            System.out.println();
        }

    }

}

