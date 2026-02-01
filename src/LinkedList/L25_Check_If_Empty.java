package LinkedList;

import java.util.LinkedList;

public class L25_Check_If_Empty {
    public static void main(String[] args) {
        LinkedList<String> c1=new LinkedList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("The original linked list "+c1);
        System.out.println("Check above of the linked list is empty or not--> "+c1.isEmpty());
        c1.removeAll(c1);
        System.out.println("Check if the linked list is empty or not--> "+c1.isEmpty());
    }
}
