package HashSet;

import java.util.HashSet;

public class H6_Clone_HashSet {
    public static void main(String[] args) {
        HashSet<String>h_set=new HashSet<>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("The original hashset is -->"+h_set);
        HashSet<String>h_new=new HashSet<String>();
        h_new=(HashSet)h_set.clone();
        System.out.println("THe cloned hashset will be -->"+h_new);
    }
}
