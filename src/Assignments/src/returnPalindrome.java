public class returnPalindrome {
    public static void main(String[] args){
        String[] rays = {"alpha","beta","gamma","delta","gamma","beta","alpha"}; // change elements to see the result "false"
        System.out.println(checkforPalindrome(rays));

    }
    public static boolean checkforPalindrome(String[] array){
        boolean isPalindrome = false;
        int k = 1;
        for(int i = 0;i<array.length;i++){
//            System.out.println("front value: "+array[i]); //uncomment to check
//            System.out.println("back value: "+array[array.length-k]);   //uncomment to check
            if(array[i]== array[array.length-k]){
                isPalindrome= true;
            }else{
                isPalindrome= false;
                break;
            }
        k++;
        }
        return isPalindrome;
    }
}
