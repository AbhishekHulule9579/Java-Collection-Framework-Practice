package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class L3_Iterate_At_Specific {
    public static void main(String[] args) {
        LinkedList<String>l_list=new LinkedList<String>();
        l_list.add("Black");
        l_list.add("Blue");
        l_list.add("Red");
        l_list.add("Yellow");
        l_list.add("Brown");

        Iterator p=l_list.listIterator(1);
        while(p.hasNext()){
            System.out.println(p.next());
        }
    }
}
/*
Blue
Red
Yellow
Brown

* */
