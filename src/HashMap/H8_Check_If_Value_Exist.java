package HashMap;

import java.util.HashMap;

public class H8_Check_If_Value_Exist {
    public static void main(String[] args) {
        HashMap < Integer, String > hash_map = new HashMap < Integer, String > ();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");
        System.out.println("check if green key exists");
        if(hash_map.containsValue("Green")){
            System.out.println("Exists");
        }else {
            System.out.println("Doesn't exist");
        }
    }
}
