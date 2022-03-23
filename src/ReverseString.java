import java.util.Arrays;

public class ReverseString {

    //we do this recursively by swapping between the front and the back character
    public static void reverseString(char[] s){
        int front = 0; //index of the first string
        int back = s.length-1; //index of the last string
        int loopfreq = s.length/2; //this defines how many times the while loop should go on for
        while(loopfreq!=0){
            char temp=s[back]; //save the value of the back character (it will get replaced next line and we'll lose it forever)
            s[back]=s[front]; //replace the back character with the character from the front
            s[front]=temp; //replace the front character with the 'saved' character from the back
            loopfreq--; //update the while loop condition
            front++; //move the pointer 1 position to the right
            back--; //move the pointer 1 position from the left


            //line 15 and 16 can combine with line 12 and 13 like s[back--] and s[front++]
        }
        System.out.println(Arrays.toString(s));
    }
    public static void main(String[] args){
        char[]s={'K','H','I','N','G'};
        reverseString(s);
    }
}
