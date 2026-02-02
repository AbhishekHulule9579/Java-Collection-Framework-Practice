package HashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class H8_Convert_HashSet_To_TreeSet {
    public static void main(String[] args) {
        HashSet<String>h_set=new HashSet<String>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("The original hashset is "+h_set);
        Set<String>t_set=new TreeSet<String>(h_set);
        System.out.println("The treeSet element");
        for(String element:t_set){
            System.out.println(element);
        }
    }
}
