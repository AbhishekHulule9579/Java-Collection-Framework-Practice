package ArrayList;

import java.util.ArrayList;

public class A16_Clone_Arraylist {
    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
        ArrayList<String>newc1=(ArrayList<String>)c1.clone();
        System.out.println("The cloned arraylist: "+newc1);
    }
}
