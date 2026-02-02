package HashSet;

import java.util.HashSet;

public class H7_HashSet_To_Arraylist {
    public static void main(String[] args) {
        HashSet<String>h_set=new HashSet<String>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("The original hashset will be "+h_set);
        String[] new_Array=new String[h_set.size()];
        h_set.toArray(new_Array);
        System.out.println("Printing the arraylist ");
        for(String element:new_Array){
            System.out.println(element);
        }
    }
}
