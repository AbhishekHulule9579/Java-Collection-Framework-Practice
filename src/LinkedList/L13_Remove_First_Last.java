package LinkedList;

import java.util.LinkedList;

public class L13_Remove_First_Last {
    public static void main(String[] args) {
        LinkedList<String>l_list=new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");
        System.out.println("The original Linkedlist is: "+l_list);
        l_list.removeFirst();
        l_list.removeLast();
        System.out.println("After removing the first and last element: "+l_list);
    }
}
