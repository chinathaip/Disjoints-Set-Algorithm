public class recursive_doubleReverse {
    public static void main (String[] args){
//        iterative("Hello Bro");
//        System.out.println("");
        recursive("Hello Bro");
    }
    public static void iterative (String s){
        for (int i = s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
            System.out.print(s.charAt(i));
        }
    }

    public static void recursive (String s){
        //recursive case
        if(!s.isEmpty()){
            recursive(s.substring(1)); // keeps removing one character at a time until the string is empty(bottom recursion)
            //once the recursion reached its bottom, it then starts coming back up.
            //to print in reverse --> put the print statement below the recursive call
            System.out.print(s.charAt(0));
            System.out.print(s.charAt(0));
        }
        //base case
    }
}
