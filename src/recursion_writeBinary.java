public class recursion_writeBinary {
    public static void main (String[] args){
        writeBinary(44);

    }
    public static void writeBinary (int denary){
        if(denary <=0){ // if there's no more to divide --> bottom recursion reached --> start going backward
            System.out.println("");

        }else if (denary %2 ==0){ // if the remainder of denary is 0 --> print 0
            writeBinary(denary/2);
            System.out.print(0); // to print the text in reverse, put the print statement 'after' the recursion call

        }else { // if the remainder of denary is 1 --> print 1
            writeBinary(denary/2);
            System.out.print(1);
        }

    }

    public static void shorterV (int n) {
        if (n < 2) {
            // base case
            System.out.print(n);
        } else {
            // recursive case
            shorterV(n /2);
            shorterV(n % 2);

            /*
            Pattern
            44 --> 22 --> 11 --> 5 -- > 2 -- > 1
            2 --> 5 --> 11 --> 22 --> 44
             */


        }
    }
}
