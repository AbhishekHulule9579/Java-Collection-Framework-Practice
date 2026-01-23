package LinkedList;

import java.util.LinkedList;

public class L20_Peek_First {
    public static void main(String[] args) {
        LinkedList<String> c1=new LinkedList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("The original linked list "+c1);
        System.out.println("Remove the first element: "+c1.peek());
        System.out.println("The linked list after peeking the first element "+c1);
    }
}
