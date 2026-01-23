package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class L16_Shuffle_LinkedList {
    public static void main(String[] args) {
        LinkedList<String>l_list=new LinkedList<>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");
        System.out.println("The original LinkedList "+l_list);
        System.out.println(l_list);
        Collections.shuffle(l_list);
        System.out.println("The shuffled linkedList "+l_list);
    }
}
