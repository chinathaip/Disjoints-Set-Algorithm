import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sets_sortandremoveduplicate {
    public static void main(String[] args){
        List<Integer>list1 = Arrays.asList(7, 4,-9, 4, 15, 8, 27, 7, 11,-5, 32,-9,-9);
        System.out.println(sortAndRemoveDuplicates(list1));
    }
    public static Set<Integer> sortAndRemoveDuplicates(List<Integer>list1){
        Set<Integer>newlist = new TreeSet<>();
        newlist.addAll(list1);

        return newlist;
    }
}
