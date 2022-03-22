import java.util.Scanner;

public class recursion_writeNums {
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Num ?: ");
        int userinput = reader.nextInt();
        writeNums(userinput);
        if(userinput<1){
            throw new IllegalArgumentException();
        }
    }
    public static void writeNums(int n){
        if (n == 0){
            System.out.print("");
        }else {
            writeNums(n-1);
            System.out.print(n+" ");
        }
    }
}
