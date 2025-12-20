package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class A14_Swap_2_Element {
    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Array list before swap");
        System.out.println(c1);
        Collections.swap(c1,0,2);
        System.out.println("Array list after swap");
        System.out.println(c1);
    }
}
