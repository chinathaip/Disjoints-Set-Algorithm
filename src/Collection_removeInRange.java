import java.util.*;

public class Collection_removeInRange {
    public static void main (String[] args){
        List <Integer> list = new LinkedList<>(Arrays.asList(0, 0, 2, 0, 4, 0, 6, 0, 8, 0, 10, 0, 12, 0, 14, 0, 16));
//        double start = System.nanoTime();
        removeInRange(list,0,5,13);
//        double end = System.nanoTime();
//        System.out.println(start);
//        System.out.println(end);
//        System.out.println("Elapsed time in nano second: "+(end-start));
    }
    public static void removeInRange(List<Integer> list,int element_value,int start_index,int end_index){
        Iterator<Integer> iterator = list.iterator();
        int index = 0; //create something we can keep track of the index
        while(iterator.hasNext()){
            System.out.println(index);
            int element = iterator.next(); //get the element
            if(index>= start_index && index <end_index){ //only remove within the given range
                //in this case: start from index 5 and end before index 13
                if(element==element_value){
                    iterator.remove();
                }
            }
            index++;
            //increment the index
        }
        System.out.println(list);
    }
}
