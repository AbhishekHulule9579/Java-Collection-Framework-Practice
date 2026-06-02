package TreeMap;

import java.util.Set;
import java.util.TreeMap;

public class T5_Get_All_Keys {
    public static void main(String[] args) {
        TreeMap<String,String>treeMap=new TreeMap<String, String>();
        treeMap.put("t1","Red");
        treeMap.put("t2","Black");
        treeMap.put("t3","Blue");
        treeMap.put("t4","Yellow");
        Set<String> key=treeMap.keySet();
        for(String keys:key){
            System.out.println(keys);
        }
    }
}
