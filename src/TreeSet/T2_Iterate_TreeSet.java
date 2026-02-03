package TreeSet;

import java.util.TreeSet;

public class T2_Iterate_TreeSet {
    public static void main(String[] args) {
        TreeSet<String>tree_set=new TreeSet<String>();
        tree_set.add("Red");
        tree_set.add("Green");
        tree_set.add("Orange");
        tree_set.add("White");
        tree_set.add("Black");
        for(String element:tree_set){
            System.out.println(element);
        }
    }
}
