package LinkedList;

import java.util.LinkedList;

public class L12_Remove_At {
    public static void main(String[] args) {
        LinkedList<String>l_list=new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");
        System.out.println("The original linkedlist is "+l_list);
        l_list.remove(2);
        System.out.println("The updated linked list after the removal of index 2 is: "+l_list);
    }
}
