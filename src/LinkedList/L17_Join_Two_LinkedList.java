package LinkedList;

import java.util.LinkedList;

public class L17_Join_Two_LinkedList {
    public static void main(String[] args) {
        LinkedList<String>c1=new LinkedList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        LinkedList<String>c2=new LinkedList<>();
        c2.add("Blue");
        c2.add("Yellow");
        c2.add("Violet");
        c2.add("White");
        LinkedList<String>a=new LinkedList<>();
        a.addAll(c1);
        a.addAll(c2);
        System.out.println("the linked list after adding the linkedlist to each other "+a);
    }
}
