import java.util.Random;

public class threeHeads {
    public static void main(String[] args){
        Random rand = new Random();
        int c1_rand;
        int num_heads=0;
        char c1_ht;
        boolean threeheads = false ;

        do{
            c1_rand = rand.nextInt(2);  // 0 and 1

            if (c1_rand ==0){   // 0 = H
                c1_ht = 'H';
                num_heads++;
            }else{              // 1 = T
                c1_ht = 'T';
                num_heads=0;
            }




            System.out.print(c1_ht);
            System.out.println("");


            if (num_heads==3){
                threeheads=true;
            }

        }while(!threeheads);
        System.out.println("Congrats..!! Three heads in a row...!!!!!");
    }
}
