package LinkedList;

import java.util.LinkedList;

public class L14_Clear_LinkedList {
    public static void main(String[] args) {
        LinkedList<String>l_list=new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");
        System.out.println("Original LinkedList "+l_list);
        l_list.clear();
        System.out.println("LinkedList after clearing the LinkedList: "+l_list);
    }
}
