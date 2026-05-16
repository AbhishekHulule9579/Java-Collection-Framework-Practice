package HashMap;

import java.util.HashMap;

public class H3_Copy_To_Another_Map {
    public static void main(String[] args) {
        HashMap<Integer,String>map1=new HashMap<Integer, String>();
        HashMap<Integer,String>map2=new HashMap<Integer, String>();
        map1.put(1,"Black");
        map1.put(2,"Blue");
        map1.put(3,"Yellow");
        System.out.println("Values in first map is "+map1);
        map2.put(4,"Red");
        map2.put(5,"White");
        map2.put(6,"Violet");
        System.out.println("The values in second map is "+map2);
        map2.putAll(map1);
        System.out.println("All values are "+map2);
    }
}
