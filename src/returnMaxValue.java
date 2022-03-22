public class returnMaxValue {
    public static void main(String[] args){
        int [] array_num = {5,7,3,8,6,15,77,32};
        System.out.println(max(array_num));

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



}
