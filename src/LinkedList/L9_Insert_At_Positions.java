package LinkedList;

import java.util.LinkedList;

public class L9_Insert_At_Positions {
    public static void main(String[] args) {
        LinkedList<String>l_list=new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        System.out.println("Original Linked List of list 1 is "+l_list);

        LinkedList<String>new_l_list=new LinkedList<String>();
        new_l_list.add("Golden");
        new_l_list.add("Black");
        new_l_list.add("Yellow");

        System.out.println("2nd Linked List "+new_l_list);

        l_list.addAll(1,new_l_list);
        System.out.println("Updated Linked List "+l_list);

    }
}
