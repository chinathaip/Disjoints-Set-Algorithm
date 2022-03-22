public class returnSwappedElements {
    public static void main(String[] args){
        int [] array_num = {10,20,30,40,50};
        swapPairs(array_num);
    }
    public static void swapPairs(int[] array_num){
        for(int j =0;j<array_num.length-1;j+=2){// temp not updating cuz 10 keeps incrementing its index :  fixed by j+=2
            int temp = array_num[j];// save the value of array_num[j] (it will be replaced by array_num[j+1]
            System.out.println(temp);
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
}
