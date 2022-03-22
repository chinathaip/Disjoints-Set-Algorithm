public class recursion_doubledigit {
    public static void main(String[] args){
        doubleDigit(-745);
    }
    public static void doubleDigit (int n){
        if(n!=0){
            if(n<0){
                System.out.print("-");
                n=Math.abs(n);
                doubleDigit(n/10);
                System.out.print(n%10);
                System.out.print(n%10);


            }else{
                doubleDigit(n/10);
                System.out.print(n%10);
                System.out.print(n%10);
            }

        }

    }
}
