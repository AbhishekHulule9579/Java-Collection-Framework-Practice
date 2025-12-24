package LinkedList;

import java.util.LinkedList;

public class L2_Iterate_Linkedlist {
    public static void main(String[] args) {
        LinkedList<String>l_list=new LinkedList<String>();
        l_list.add("Apple");
        l_list.add("Banana");
        l_list.add("Cherry");
        l_list.add("Grapes");
        l_list.add("Pineapple");

        for (String element:l_list){
            System.out.println(element);
        }
    }
}
