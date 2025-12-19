package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A11_Reverse_Arraylist {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println("Arraylist before reverse "+list_Strings);
        Collections.reverse(list_Strings);
        System.out.println("Arraylist after the reverse of the arraylist "+list_Strings);
    }
}
