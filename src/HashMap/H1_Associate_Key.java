package HashMap;

import java.util.HashMap;
import java.util.Map;

public class H1_Associate_Key {
    public static void main(String[] args) {
        HashMap<Integer,String>map=new HashMap<Integer,String>();
        map.put(1,"Red");
        map.put(2,"Blue");
        map.put(3,"Yellow");
        map.put(4,"Black");

        for(Map.Entry x: map.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }
}
