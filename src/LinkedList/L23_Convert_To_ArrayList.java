package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class L23_Convert_To_ArrayList {
    public static void main(String[] args) {
        LinkedList<String> c1=new LinkedList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("The original linked list "+c1);

        System.out.println("THe arraylist conversion will be ");
        List<String>list=new ArrayList<String>(c1);
        for(String str:list){
            System.out.println(str);
        }
    }
}
