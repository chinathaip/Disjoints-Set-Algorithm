public class recursion_starString {
    public static void main (String[] args){
        starString(4);
    }
    public static void starString (int n){
        // if true = run line 11 (n is initallly 1)
        // if false = run line 10 (n is initially 1)

        //print = bottom recursion for the first call
        //not print = bottom recursion for the second call
        if (n == 0){
            System.out.print("*");
        }else{
            starString(n-1);//after this call reaches the bottom it goes to the below line
            starString(n-1);// it took line 10 4 times to reach the bottom recursion, so the below line loops 4 times
            // as it tries to loop back 4 times, it sometimes goes back to line 10 because the 'if' statement is wrong.
            /*
            for example:
                1. Line 10 runs 4 times to print 1 star (1 star in total) (took 4 times to reach the bottom recursion)
                2. Line 11, n initially becomes 1 --> n - 1 = 0, so the if statement becomes true, so line 11 run (2 stars)
                3. Line 11, n becomes 2 --> n - 1 = 1, the statement is false, it runs Line 10 (took 2 times to reach the bottom recursion)
                4. Line 10, n initially becomes 1 --> n - 1 = 0, so the statement becomes true, so line 11 run (3 stars)
                and so on
             */
        }
        //4 --> 3 --> 2 --> 1 --> 0
        // 1 --> 2 --> 3 --> 4

    }
}
