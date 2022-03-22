import java.util.Arrays;

public class TestApp {
    public static void main (String[] args){
        int [] array_num = {5,7,3,8,6,15,77,32};//return max value
        int[] array_num2 = {1,2,3,4,5,6,7,8,9};//reverse order
        int [] array_num3 = {10,20,30,40,50};//swap values
        String[] rays = {"alpha","beta","gamma","delta","gamma","beta","alpha"};//returnPalindrome
        int[][] pyramid_num = new int [5][];//createjaggedarray


        //uncomment to call each function
//        System.out.println(max(array_num));               //task1
//        printBackwards(array_num2);                       //task2
//        swapPairs(array_num3);                            //task3
//        System.out.println(checkforPalindrome(rays));     //task4
        createJaggedArray(pyramid_num);                   //task5


    }

    public static int max (int [] numbers){
        int highest_num = 0;
        for(int i = 0;i<numbers.length;i++){
            if (numbers[i]>highest_num){
                highest_num = numbers[i];
            }
        }
        return highest_num;
    }

    public static void printBackwards(int[] array_num){
        int k = 1;
        int[] reversed_array = new int[array_num.length]; //create a new array to store the reversed value
        for(int i =0;i< array_num.length;i++){
            reversed_array[i]=array_num[array_num.length-k];
            k++;
        }

        System.out.println(Arrays.toString(reversed_array));
    }

    public static void swapPairs(int[] array_num){
        for(int j =0;j<array_num.length-1;j+=2){// temp not updating cuz 10 keeps incrementing its index :  fixed by j+=2
            int temp = array_num[j];// save the value of array_num[j] (it will be replaced by array_num[j+1]
            if(array_num.length!=1) {//make sure it doesn't swap the last odd number
                array_num[j]=array_num[j+1]; // replace array_num[j] with array_num[j+1]
                array_num[j+1]=temp;// replace array_num[j+1] with the value from array_num[j] (stored in temp)
            }
        }
        if(array_num.length ==0){
            System.out.println("[]");
        }else{
            System.out.print("[ ");
            System.out.print(array_num[0]);
            for (int k =1;k<array_num.length;k++){
                System.out.print(", "+array_num[k]);
            }
        }

        System.out.println("]");
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

    public static void createJaggedArray(int [][] normal_array){
        int num = 1;
        for (int i = 1;i <=5;i++){
            for(int j =1;j<=i;j++){
                normal_array[i-1]=new int[j]; // create empty array (increasing size by 1 each time)
            }
        }

        for (int i = 0;i<5;i++){
            for(int j = 0;j<=i;j++){
                normal_array[i][j]=num; // fill in the number
                num+=1;
            }
        }

        for(int i=0;i<5;i++){
            System.out.println(Arrays.toString(normal_array[i]));
        }

    }
}
