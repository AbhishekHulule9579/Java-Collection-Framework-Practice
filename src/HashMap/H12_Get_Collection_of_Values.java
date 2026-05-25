package HashMap;

import java.util.HashMap;

public class H12_Get_Collection_of_Values {
    public static void main(String[] args) {
        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();
        hash_map.put(1,"Red");
        hash_map.put(2,"Green");
        hash_map.put(3,"Black");
        hash_map.put(4,"White");
        hash_map.put(5,"Blue");
        System.out.println("The collection view is "+hash_map);
    }
}
