package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class H2_Iterate_Element {
    public static void main(String[] args) {
        HashSet<String>h_set=new HashSet<String>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");

        Iterator<String>h_next=h_set.iterator();
        while(h_next.hasNext()){
            System.out.println(h_next.next());
        }
    }
}
