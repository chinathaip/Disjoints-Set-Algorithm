public class recursion_writeChars {
    public static void main (String[] args){
        writeChars(8);
    }
    public static void writeChars(int n){
        if (n==0){
            System.out.print("");
        } else if (n == 1) {
            System.out.print("*");
        }else if(n==2){
            System.out.print("**");
        }
        else {
            System.out.print("<");
            writeChars(n-2);
            System.out.print(">");
        }
    }
}
