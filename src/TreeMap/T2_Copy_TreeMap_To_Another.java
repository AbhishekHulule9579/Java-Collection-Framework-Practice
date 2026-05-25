package TreeMap;

import java.util.TreeMap;

public class T2_Copy_TreeMap_To_Another {
    public static void main(String[] args) {
        TreeMap<Integer,String>tree_map=new TreeMap<Integer, String>();
        tree_map.put(1,"Red");
        tree_map.put(2,"Blue");
        tree_map.put(3,"Black");
        tree_map.put(4,"Violet");
        System.out.println("Original tree Map");
        System.out.println(tree_map);

        TreeMap<Integer,String>tree_map2=new TreeMap<Integer, String>();
        tree_map2.put(99,"Pink");
        tree_map2.put(10,"orange");
        System.out.println("Second tree map");
        System.out.println(tree_map2);
        tree_map2.putAll(tree_map);
        System.out.println("combining the tree map map1 --> map2");
        System.out.println(tree_map2);
    }
}
