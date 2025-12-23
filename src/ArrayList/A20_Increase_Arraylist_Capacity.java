package ArrayList;

import java.util.ArrayList;

public class A20_Increase_Arraylist_Capacity {
    public static void main(String[] args) {
        ArrayList<String>c1=new ArrayList<String>(3);
        c1.add("Black");
        c1.add("Blue");
        c1.add("Yellow");
        System.out.println("Original Arraylist: "+c1);
        c1.ensureCapacity(6);
        c1.add("Red");
        c1.add("Indigo");
        c1.add("White");
        System.out.println("Arraylist after the increasing capacity: "+c1);
    }
}
