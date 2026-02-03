package TreeSet;

import java.util.TreeSet;

public class T6_Clone_TreeSet {
    public static void main(String[] args) {
        TreeSet<String> tree_set=new TreeSet<String>();
        tree_set.add("Red");
        tree_set.add("Green");
        tree_set.add("Orange");
        tree_set.add("White");
        tree_set.add("Black");
        System.out.println("The orignal tree set is : "+tree_set);
        TreeSet<String>new_tree_set=(TreeSet<String>) tree_set.clone();
        System.out.println("The cloned tree set is: "+new_tree_set);
    }
}
