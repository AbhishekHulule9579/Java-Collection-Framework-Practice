package LinkedList;

import java.util.LinkedList;

public class L5_Insert_At_Position {
    public static void main(String[] args) {
        LinkedList<String>l_list=new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        System.out.println("Original Linked list");
        System.out.println("Let yellow color after the red color "+l_list);

        l_list.add(1,"Yellow");
        System.out.println("After adding "+l_list);
    }
}
