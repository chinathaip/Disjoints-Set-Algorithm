public class recursion_GCD {
    public static void main (String [] args){
        System.out.println(gcd(132,20));
    }

    // this is according to Euclid's Algorithm
    // ignore the multiplication of the smaller integer from the larger one
    // for example: 132 = (20*6) + 12
    // we only take 12, so it's like    gcd(132,20) --> gcd (12,20)
    public static int gcd (int num1, int num2){
        if (num1 ==0) {
            return num2;
        } else {
            return gcd(num2 %num1,num1);
            // num2 % num1 = num3
            // the num3 will become the new num1 when the recursion occurs
        }
    }
}
