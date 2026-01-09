package LinkedList;

import java.util.LinkedList;

public class L7_Insert_At_Front {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        System.out.println("Original linked list:" + l_list);
        l_list.offerFirst("Pink");
        System.out.println("Updated Linked List "+l_list);
    }
}
