public class recursion_pow {
    public static void main (String[] args){
        System.out.println(pow(2,10));
    }

    public static int pow (int x ,int y){ // x to the  power of y
        // recursive case
        if(y!= 0){
            return (x * pow(x,y-1)); /* pow(x,y-1) will keep recurring until y = 1(bottom recursion)
                                         it will then start passing back the value to the top

                                         2 pow (x,9) --> 2 pow (x,8)--> .... 2 pow(x,1) then it goes back up, returning the value of each 'pow'
                                         2x1 --> 4x1--> 8x1 -->.... --> 1024x1
                                         */
        }
        else{
            return 1;
        }
    }
}
