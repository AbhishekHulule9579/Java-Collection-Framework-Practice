package HashSet;

import java.util.HashSet;

public class H11_Remove_All {
    public static void main(String[] args) {
        HashSet<String>h_set=new HashSet<String>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("The original hashset is "+h_set);
        h_set.clear();
        System.out.println("HashSet content "+h_set);

    }
}
