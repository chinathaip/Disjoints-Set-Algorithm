import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;



/*
 every statement should be written in one line

    if (random_num/10 ==user_guess/10
        || random_num%10 == user_guess%10)

 */



public class removecomment {
    public static void main (String[] args)throws FileNotFoundException {// dont run itself, it's a mess...
        Scanner reader = new Scanner(new File("E:/STIU Stuff/ITE221/Assignments/src/AddAllDigit.java"));
        stripComment(reader);
    }

    /*
    two versions,


    .indexOf will get you the int value (index)
    .contains will get you the boolean value (contain or not/ true false)

    if  it doesnt exist in that line
    1. line.indexOf(...) == -1
    2. !line.contains(...)

    if it exists in that line
    1. line.indexOf(...) >= 0
    2. line.contains(...)


     */

    public static void stripComment(Scanner input){
        while (input.hasNextLine()) {
            String line = input.nextLine();
            //this is for the case where the line contains /* and */
            if(line.contains("/*")){
                if(line.contains("*/")){
                    line = line.substring(0,line.indexOf("/*"))+line.substring(line.indexOf("*/")+2);
                }else{
                    line = line.substring(0,line.indexOf("/*"));
                }

            }

            //this is for the case where comment is written after the code
            else if(line.indexOf(';')>=0 || line.indexOf('{')>=0){
                if (line.indexOf(';')>=0 && line.indexOf('{')==-1){ // if ends with ;
                    if(line.contains("//")){
                        line = line.substring(0,line.indexOf("//"));
                    }else {
                        line = line.substring(0,line.indexOf(';')+1);
                    }

                }else if(line.indexOf(';')==-1 && line.indexOf('{')>=0){// if ends with {
                    if(line.contains("//")){
                        line = line.substring(0,line.indexOf("//"));
                    }else {
                        line = line.substring(0,line.indexOf('{')+1);
                    }
                }
            }

            //this is for the case where the line doesn't contain any mentioned operators
            else if(!line.contains(";") && !line.contains("{") && !line.contains("//")&& !line.contains("/*")) {// if it's a string that doesn't contain  ; or { or // or /*
                if (!line.contains("}")){ // is it the }?
                    line = ""; // if not, then it's either the following text from the '/*.... */' OR the '*/' itself
                }

            }

            //this is for the case where the line starts with a comment //
            else if(line.contains("//")){// if starts with //
                line = ""; // replace the whole line with space
            }
            System.out.println(line);
        }
    }
}
