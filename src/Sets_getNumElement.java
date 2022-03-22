import java.util.HashSet;
import java.util.Set;

public class Sets_getNumElement {
    public static void main (String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(1);// this should not be added

        System.out.println(getNum(set));
    }
    public static int getNum(Set<Integer> set){
        return set.size();
    }
}
