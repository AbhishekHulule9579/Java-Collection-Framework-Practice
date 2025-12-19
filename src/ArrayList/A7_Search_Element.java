package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class A7_Search_Element {
    public static void main(String[] args) {
        List<String> stringList=new ArrayList<String>();
        stringList.add("Red");
        stringList.add("Green");
        stringList.add("Orange");
        stringList.add("White");
        stringList.add("Black");
        for(String str:stringList){
            System.out.print(str+" ");
        }
        System.out.println();
        if(stringList.contains("Black")){
            System.out.println("The element is found");
        }
        else{
            System.out.println("The element is not found");
        }
    }
}
