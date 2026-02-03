package src;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionLearnings {
    
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>(20);
        System.out.println(list2.size());
        list2.add(null);
        System.out.println(list2.size());


        Set<Integer> set;
        set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        System.out.println(set.size());

        for(Integer setEntry: set){
            System.out.print(setEntry + " ");
        }

        List<Integer> list4 = new ArrayList<>(set);

        for (Integer integer : list4) {
            System.err.print(integer + " ");
        }
        
    }

}
