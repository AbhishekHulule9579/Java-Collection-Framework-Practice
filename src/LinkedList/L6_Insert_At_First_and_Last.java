package LinkedList;

import java.util.LinkedList;

public class L6_Insert_At_First_and_Last {
    public static void main(String[] args) {
        LinkedList<String>l_list=new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        System.out.println("Original linked list is "+l_list);
        l_list.addFirst("White");
        l_list.addLast("Yellow");
        System.out.println("Updated Linked List is "+ l_list);
    }
}
