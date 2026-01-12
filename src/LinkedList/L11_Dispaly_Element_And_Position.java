package LinkedList;

import java.util.LinkedList;

public class L11_Dispaly_Element_And_Position {
    public static void main(String[] args) {
        LinkedList<String>l_list=new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");
        System.out.println("The original linkedlist is: "+l_list);
        for(int i=0;i<l_list.size();i++){
            System.out.println("Element at the index "+i+": "+l_list.get(i));
        }
    }
}
