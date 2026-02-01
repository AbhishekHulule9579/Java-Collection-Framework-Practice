package LinkedList;

import java.util.LinkedList;

public class L26_Replace_Element {
    public static void main(String[] args) {
        LinkedList<String> c1=new LinkedList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("The original linked list "+c1);
        c1.set(1,"Orange");
        System.out.println("The value of the second element changed ");
        System.out.println("The new linked list: "+c1);
    }
}
