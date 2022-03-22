import java.util.Arrays;

public class returnReverseOrder {
    public static void main(String[] args){
        int[] array_num = {1,2,3,4,5,6,7,8,9};
        printBackwards(array_num);
    }
    public static void printBackwards(int[] array_num){
        int k = 1;
        int[] reversed_array = new int[array_num.length]; //create a new array to store the reversed value
        for(int i =0;i< array_num.length;i++){
            reversed_array[i]=array_num[array_num.length-k];//-1 prevents the array to have 9 index('i' is initially 0)
            k++;
        }

        System.out.println(Arrays.toString(reversed_array));
    }


}
