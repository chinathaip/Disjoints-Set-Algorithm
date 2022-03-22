import java.util.Arrays;

public class returnPyramidNumber {
    public static void main (String[] args){
        int[][] pyramid_num = new int [5][];
        createJaggedArray(pyramid_num);
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
