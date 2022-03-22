import java.util.Scanner;

public class AddAllDigit {
    public static int digitSum(int digit){
        int total_sum = 0;
        int one_digit;
        if(digit==0){
            return total_sum;
        }
        String digit_string = "";
        digit_string=Integer.toString(digit);  //convert to string
        int digit_length = digit_string.length(); //find out how many digits there are
        int multiplier = 1;
        for(int j = 0;j<digit_length-1;j++){
            multiplier *= 10;  // 10 * 10 = 100
        }

        /*
        AHEHEHEHEHEHEHE
         */


        //example input : 641
        for (int i=0;i <  digit_length;i++){  //need to reorder!!!
            one_digit = digit/multiplier; //get the front digit by dividing the input by multiplier 641/100 = 6       41/10  = 4      1/1 = 1
            digit = digit-(one_digit*multiplier); //delete the front digit by using the multiplying the multiplier with the front digit so 641-(6*100) = 41        41-(4*10) = 1
            System.out.println("after remove the front digit: "+digit);
            System.out.println("target digit: "+one_digit);
            total_sum = total_sum +one_digit;  //add digits together 0 + 6  = 6        6 + 4 = 10     10 + 1 = 11
            System.out.println("sum + target digit: "+total_sum);
            multiplier/=10;// 100 /10  = 10      10/10 = 1



        }
        if(total_sum<0){ //if negative
            System.out.println("Since your number is negative, we will convert them to positive for you: ");
            return Math.abs(total_sum); // Math.abs() swaps between + and -
        }else {
            return total_sum;
        }

    }


    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int userinput = reader.nextInt();
        System.out.println("");
        System.out.println("Number : "+userinput);
        System.out.println(digitSum(userinput));

    }
}
