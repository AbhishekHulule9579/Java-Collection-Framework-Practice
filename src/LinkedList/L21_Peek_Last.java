package LinkedList;

import java.util.LinkedList;

public class L21_Peek_Last {
    public static void main(String[] args) {
        LinkedList<String> c1=new LinkedList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("The original linked list "+c1);
        String x=c1.peekLast();
        System.out.println("The element at the last of the linked list: "+x);

    }
}
