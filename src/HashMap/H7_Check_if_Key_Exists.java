package HashMap;

import java.util.HashMap;

public class H7_Check_if_Key_Exists {
    public static void main(String[] args) {
        HashMap<String,Integer> hash_map= new HashMap<String,Integer>();
        hash_map.put("Red", 1);
        hash_map.put("Green", 2);
        hash_map.put("Black", 3);
        hash_map.put("White", 4);
        hash_map.put("Blue", 5);
        System.out.println("The original hashmap is "+hash_map);
        System.out.println("check if green key exists");
        if(hash_map.containsKey("Green")){
            System.out.println("yes -- "+hash_map.get("Green"));
        }
        else {
            System.out.println("Not exists");
        }
        System.out.println("check if Orange key exists");
        if(hash_map.containsKey("Orange")){
            System.out.println("yes -- "+hash_map.get("Orange"));
        }
        else {
            System.out.println("Not exists");
        }
    }
}
