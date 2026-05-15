package HashMap;

import java.util.HashMap;

public class H2_Count_Key_Value {
    public static void main(String[] args) {
        HashMap<Integer,String>map=new HashMap<Integer,String>();
        map.put(1,"Red");
        map.put(2,"Black");
        map.put(3,"Blue");
        map.put(4,"Yellow");
        map.put(5,"Green");

        System.out.println("The hash map size is "+map.size());
    }
}
