package HashMap;

import java.util.HashMap;

public class H6_Shallow_Copy {
    public static void main(String[] args) {
        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");
        System.out.println("The hashmap is "+hash_map);
        HashMap<Integer,String>new_hash_map=new HashMap<Integer,String>();
        new_hash_map=(HashMap)hash_map.clone();
        System.out.println("the shallow hashmap is "+new_hash_map);
    }
}
