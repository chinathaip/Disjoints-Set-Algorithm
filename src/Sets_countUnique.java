import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets_countUnique {
    public static void main(String[] args){
        List<Integer>list = Arrays.asList(3, 7, 3,-1, 2, 3, 7, 2, 15, 15);
        System.out.println(countUnique(list));
    }
    public static int countUnique(List<Integer> list){
        Set<Integer>newlist = new HashSet<Integer>(); //hash set is faster,  no need for index and ordering in this case.
        newlist.addAll(list); //any duplicates will be removed
        return newlist.size(); // now just return the whole set
    }
}
