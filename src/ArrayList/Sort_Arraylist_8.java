package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_Arraylist_8 {
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
        Collections.sort(stringList);
        for(String str:stringList){
            System.out.print(str+" ");
        }
    }
}
