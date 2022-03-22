import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps_contains3 {
    public static void main(String[]args){
        List<String>list = Arrays.asList("Tedison","Tedison","Tedison","S","Khing");
        System.out.println(contains3(list));
    }
    public static boolean contains3(List<String> list1){
        Map<String,Integer>map1 = new HashMap<>();
        for(String word:list1){
            if(map1.containsKey(word)){ // if that word is already in map1
                map1.put(word,map1.get(word)+1);// increase the appeared time by 1
            }else{// if that word is not in map1
                map1.put(word,1); //
            }
            if(map1.get(word)==3){ //if the appeared time is 3 then return true
                return true;
            }

        }
        return false;
    }
    /*
        in this case: get(word) returns how many times 'word' appears in the list

        get(key) works the same as 'select' in sql
        it will return the value of the specified key

        we use value to keep track of how many times the same word appears

        map1 structure:   ( word     ,   number of times it appears)
              or          ( key      ,           value             )

        when call get(word), 'word' will be used as key and the appeared time will be value

         */
}
