package LinkedList;

import java.util.LinkedList;
import java.util.Objects;

public class L10_Get_First_And_Last {
    public static void main(String[] args) {
        LinkedList<String>l_list=new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");
        System.out.println("The original LinkedList: "+l_list);
        Object first=l_list.getFirst();
        System.out.println("The first occuring element: "+first);
        Object last=l_list.getLast();
        System.out.println("The last occuring element: "+last);
    }
}
