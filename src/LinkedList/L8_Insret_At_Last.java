package LinkedList;

import java.util.LinkedList;

public class L8_Insret_At_Last {
    public static void main(String[] args) {
        LinkedList<String>l_list=new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        System.out.println("Original Linked List "+l_list);
        l_list.offerLast("White");
        System.out.println("Updated Linked List "+l_list);
    }
}
