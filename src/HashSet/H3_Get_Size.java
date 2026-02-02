package HashSet;

import java.util.HashSet;

public class H3_Get_Size {
    public static void main(String[] args) {
        HashSet<String>h_set=new HashSet<String>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("The original HashSet "+h_set);
        System.out.println("The size of the hashset is "+h_set.size());
    }
}
