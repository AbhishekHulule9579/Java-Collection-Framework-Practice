package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A9_Copy_To_ArrayList {
    public static void main(String[] args) {
        List<String> List1=new ArrayList<String>();
        List1.add("Red");
        List1.add("Green");
        List1.add("Orange");
        List1.add("White");
        List1.add("Black");
        for(String str:List1){
            System.out.print(str+" ");
        }
        System.out.println();
        List<String> List2=new ArrayList<String>();
        List2.add("1");
        List2.add("2");
        List2.add("3");
        List2.add("4");
        List2.add("5");
        for(String str:List2){
            System.out.print(str+" ");
        }
        System.out.println();
        System.out.println("Copy List from list1 to list 2 after copy");
        Collections.copy(List1,List2);
        System.out.println("List 1 "+ List1);
        System.out.println("List 2 "+ List2);
    }
}
