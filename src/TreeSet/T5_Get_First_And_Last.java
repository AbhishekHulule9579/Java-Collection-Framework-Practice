package TreeSet;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class T5_Get_First_And_Last {
    public static void main(String[] args) {
        TreeSet<String>tree_set=new TreeSet<String>();
        tree_set.add("Red");
        tree_set.add("Green");
        tree_set.add("Orange");
        tree_set.add("White");
        tree_set.add("Black");
        System.out.println("The original tree set is: ");
        System.out.println(tree_set);
        System.out.println("The first element of the tree set is ");
        System.out.println(tree_set.first());
        System.out.println("The last element in the tree set is ");
        System.out.println(tree_set.last());
    }
}
