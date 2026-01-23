package LinkedList;

import java.util.LinkedList;

public class L18_Copy_LinkedList {
    public static void main(String[] args) {
        LinkedList<String>c1=new LinkedList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        LinkedList<String>c2=new LinkedList<>();
        c2=(LinkedList)c1.clone();
        System.out.println("The linked list after the cloning "+c2);
    }
}
