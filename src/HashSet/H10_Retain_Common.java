package HashSet;

import java.util.HashSet;

public class H10_Retain_Common {
    public static void main(String[] args) {
        HashSet<String>h_set=new HashSet<String>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("The Hashset 1 is -->"+h_set);

        HashSet<String>h_set1=new HashSet<String>();
        h_set1.add("Red");
        h_set1.add("Green");
        h_set1.add("Black");
        h_set1.add("White");
        System.out.println("The hashset in the set 2 is: "+h_set1);
        h_set.retainAll(h_set1);
        System.out.println("Hashset content -->");
        System.out.println(h_set1);

    }
}
