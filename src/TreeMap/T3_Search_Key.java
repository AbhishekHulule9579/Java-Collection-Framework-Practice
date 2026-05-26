package TreeMap;

import java.util.TreeMap;

public class T3_Search_Key {
    public static void main(String[] args) {
        TreeMap<Integer,String>treeMap=new TreeMap<Integer, String>();
        treeMap.put(1,"Red");
        treeMap.put(2,"Black");
        treeMap.put(3,"Blue");
        treeMap.put(4,"Orange");

        System.out.println(treeMap);
        if(treeMap.containsKey(2)){
            System.out.println("Tree map contains key 2");
        }else {
            System.out.println("Tree map doesn't contain key 2");
        }
        if(treeMap.containsKey(5)){
            System.out.println("Tree map contains key 5");
        }else {
            System.out.println("Tree map doesn't contains key 5");
        }
    }
}
