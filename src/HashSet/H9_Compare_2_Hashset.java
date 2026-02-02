package HashSet;

import java.util.HashSet;

public class H9_Compare_2_Hashset {
    public static void main(String[] args) {
        HashSet<String>h_set=new HashSet<String>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");

        HashSet<String>h_set1=new HashSet<String>();
        h_set1.add("Red");
        h_set1.add("Green");
        h_set1.add("Black");
        h_set1.add("White");

        HashSet<String> result=new HashSet<String>();
        for(String element:h_set){
            System.out.println(h_set1.contains(element)? "Yes":"No");
        }
    }
}
