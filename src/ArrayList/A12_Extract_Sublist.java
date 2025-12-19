package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class A12_Extract_Sublist {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println("Original List "+list_Strings);
        List<String>list1=list_Strings.subList(1,3);
        System.out.println("Extracted Sublist "+list1);
    }
}
