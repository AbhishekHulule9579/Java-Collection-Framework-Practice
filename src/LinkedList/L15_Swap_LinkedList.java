package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class L15_Swap_LinkedList {
    public static void main(String[] args) {
        LinkedList<String>l_list=new LinkedList<>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");
        System.out.println(" The original Linked List is "+l_list);
        Collections.swap(l_list,0,2);
        System.out.println(" the linkedlist after the swaping of the element is "+l_list);
    }
}
