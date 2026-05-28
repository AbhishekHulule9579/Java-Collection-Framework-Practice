package TreeMap;

import java.util.TreeMap;

public class T4_Search_Value {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(1, "Black");
        treeMap.put(2, "Blue");
        treeMap.put(3, "White");
        treeMap.put(4, "Yellow");
        System.out.println(treeMap);

        if (treeMap.containsValue("Blue")) {
            System.out.println("It contains the blue value");
        }else
            System.out.println("It doesn't contain the value");

        if (treeMap.containsValue("Red")){
            System.out.println("It contains the red ");
        }else
            System.out.println("it doesn't contain");
    }
}
