package TreeSet;

import java.util.TreeSet;

public class T7_Get_Size {
    public static void main(String[] args) {
        TreeSet<String>tree_set=new TreeSet<String>();
        tree_set.add("Red");
        tree_set.add("Green");
        tree_set.add("Orange");
        tree_set.add("White");
        tree_set.add("Black");
        System.out.println("The original treeset is: "+tree_set);
        System.out.println("the size of the tree set is: "+tree_set.size());
    }
}
