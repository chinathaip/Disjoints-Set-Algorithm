import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class map_maxOccurences {
    public static void main(String[] args){
        List<Integer>list = Arrays.asList(12,3,5,5,5,5,5,5,5,5,57,8,9,0,2,12,3,3);
        System.out.println(maxOccurences(list));

    }
    public static int maxOccurences(List<Integer>list){
        // key = num, value = how many times it appears
        Map<Integer,Integer>map1 = new HashMap<>();
        int max =0;
        for(int num : list){
            if(map1.containsKey(num)){
                map1.put(num,map1.get(num)+1);
                if(map1.get(num)>max){
                    max = map1.get(num);
                }
            }else{
                map1.put(num,1);
            }
        }
    return max;
    }
}
