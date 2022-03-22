import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public class Sets_maxLength {
    public static void main(String[] args){

    }
    public static int maxLength(Set<String> set){
        int len=0;
        Iterator<String>iterator = set.iterator();  //use iterator to traverse the set
        while(iterator.hasNext()){
            String word = iterator.next();//get the word
            if(word.length()>len){
                len = word.length();
            }
        }
        return len;
    }
}
