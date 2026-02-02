package HashSet;

import java.util.HashSet;

public class H5_Chechk_If_Empty {
    public static void main(String[] args) {
        HashSet<String>h_set=new HashSet<String>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("The original hashset "+h_set);
        System.out.println("The hashset checking  if it is empty -->"+h_set.isEmpty());
        System.out.println("Remove all element from the hashset ");
        h_set.removeAll(h_set);
        System.out.println("Checking if the hashset is empty or what -->"+h_set.isEmpty());
    }
}
