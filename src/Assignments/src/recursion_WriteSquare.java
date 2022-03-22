public class recursion_WriteSquare {
    public static void main(String[] args){
        writeSquares(7);
    }
    public static void writeSquares (int n){
        if (n==0){
            System.out.print("");
        }
        else if(n==1){
            System.out.print(1);
        }
        else if(n%2==0){
            n -= 1;
            System.out.print(n*n+", ");
            writeSquares(n-1);
            n += 1;
            System.out.print(n*n+", ");
        }
        else{
            System.out.print(n*n +", ");
            writeSquares(n-1);


        }


    }
}
