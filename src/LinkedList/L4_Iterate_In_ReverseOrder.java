package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class L4_Iterate_In_ReverseOrder {
    public static void main(String[] args) {
        LinkedList<String>l_list=new LinkedList<String>();
        l_list.add("Black");
        l_list.add("Blue");
        l_list.add("Pink");
        l_list.add("Red");
        l_list.add("Orange");
        l_list.add("Brown");

        System.out.println("Original Linked List is");
        for(String llist:l_list){
            System.out.println(llist);
        }

        Iterator li=l_list.descendingIterator();

        System.out.println("Decending LinkedList");
        while(li.hasNext()){
            System.out.println(li.next());
        }

    }
}
/*
Original Linked List is
Black
Blue
Pink
Red
Orange
Brown
Decending LinkedList
Brown
Orange
Red
Pink
Blue
Black
*/