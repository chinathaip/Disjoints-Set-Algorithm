import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets_CountCommon {
    public static void main (String[] args){
        List<Integer>list1 = Arrays.asList(3, 7, 3,-1, 2, 3, 7, 2, 15, 15);
        List<Integer>list2 = Arrays.asList(-5, 15, 2,-1, 7,15, 36);
        System.out.println(countCommon(list1,list2));
    }
    public static int countCommon(List<Integer> list1, List list2){
        Set<Integer>set1 = new HashSet<>();
        Set<Integer>set2 = new HashSet<>();
        set1.addAll(list1); //remove duplicates in list1
        set2.addAll(list2); //remove duplicates in list2
        set1.retainAll(set2); //remains the intersection
        return set1.size();
    }
}
