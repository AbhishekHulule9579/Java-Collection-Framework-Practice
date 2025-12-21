package ArrayList;

import java.util.ArrayList;

public class A18_Check_If_Empty {
    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
        System.out.println("Checking above arraylist if it is empty: "+c1.isEmpty());
        c1.removeAll(c1);
        System.out.println("Checking above arraylist if it is empty: "+c1.isEmpty());
    }
}
