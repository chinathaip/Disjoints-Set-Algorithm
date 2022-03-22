public class recursion_factorial {
    public static void main (String[] args){
        //System.out.println(iterative(5));
        System.out.println(recursive(5));
    }
    public static int iterative(int n){
        int product = 1;
        for (int i =1;i <=n;i++){
            product *= i;
        }
        return product;
    }

    public static int recursive (int n){
        if (n ==0){
            return 1;
        }else{
            return n * recursive(n-1); //keep doing  n x n-1  until n becomes 0(bottom recursion)
        }
    }
}
