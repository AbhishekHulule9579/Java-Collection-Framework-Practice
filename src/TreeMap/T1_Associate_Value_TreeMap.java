package TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class T1_Associate_Value_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String>tree_map=new TreeMap<Integer, String>();
        tree_map.put(1,"Red");
        tree_map.put(2,"Blue");
        tree_map.put(3,"Black");
        tree_map.put(4,"Violet");

        for(Map.Entry<Integer,String>entry:tree_map.entrySet()){
            System.out.println(entry.getKey()+" => "+entry.getValue());
        }
    }
}
