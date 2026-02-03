package TreeSet;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class T3_Add_element_To_Another {
    public static void main(String[] args) {
        TreeSet<String>tree_set=new TreeSet<String>();
        tree_set.add("Red");
        tree_set.add("Green");
        tree_set.add("Orange");
        System.out.println("The tree set 1 is: "+tree_set);
        TreeSet<String>tree_set1=new TreeSet<String>();
        tree_set1.add("White");
        tree_set1.add("Black");
        System.out.println("The tree set 2 is: "+tree_set1);
        tree_set.addAll(tree_set1);
        System.out.println("The tree set 1 is: "+tree_set);
    }
}
