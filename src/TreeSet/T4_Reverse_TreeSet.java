package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class T4_Reverse_TreeSet {
    public static void main(String[] args) {
        TreeSet<String>tree_set=new TreeSet<String>();
        tree_set.add("Red");
        tree_set.add("Green");
        tree_set.add("Orange");
        tree_set.add("White");
        tree_set.add("Black");
        System.out.println("The original tree set is: "+tree_set);
        Iterator it=tree_set.descendingIterator();
        System.out.println("The tree set in the reverse order: ");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
