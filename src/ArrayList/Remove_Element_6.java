package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Remove_Element_6 {
    public static void main(String[] args) {

        List<String>stringList=new ArrayList<String>();
        stringList.add("Red");
        stringList.add("Green");
        stringList.add("Orange");
        stringList.add("White");
        stringList.add("Black");
        for(String str:stringList){
            System.out.print(str+" ");
        }
        System.out.println();
        System.out.println("The Arraylist after removing the third element");
        stringList.remove(3);
        for(String str:stringList){
            System.out.print(str+" ");
        }
    }
}
