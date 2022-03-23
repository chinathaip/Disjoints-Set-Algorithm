package Assignments.src;

public class recursion_writeSequence {
    public static void main (String[] args){
        writeSeqeunce(9);
    }
    public static void writeSeqeunce(int n){
        if(n ==0){
            System.out.print("");
        }
        else if (n ==1) { // wont print on the 'even' case (even will never reach 1, will skip to 0)
            System.out.print(1);//this is where 1 in the 'odd' case came from


        }else if(n%2 ==0){ //case for even number
            System.out.print(n/2); // this is where 1 came from (2/2 = 1)
            writeSeqeunce(n-2); // -2 to make it loop only half of n (because we have 2 print statements)
            System.out.print(n/2); // this is where 1 came from (2/2 = 1)


        }else{ //case for odd number
            //loop only half of n then add '1' from line 9 so the total print statement is equal to n
            System.out.print(n/2+1); // +1 to make sure there's only one '1' from line 9
            writeSeqeunce(n-2+1);
            System.out.print(n/2+1);
            /*
            for example:
            n/2+1 --> n = 2 --> (2/2)+1 = 1+1 = 2 (no way 1 will appear)
            */
        }
    }
}
