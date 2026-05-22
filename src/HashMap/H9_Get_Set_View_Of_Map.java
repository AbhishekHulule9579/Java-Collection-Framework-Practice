package HashMap;

import com.sun.source.doctree.SeeTree;

import java.util.HashMap;
import java.util.Set;

public class H9_Get_Set_View_Of_Map {
    public static void main(String[] args) {
        HashMap< Integer, String > hash_map = new HashMap < Integer, String > ();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");
        hash_map.put(6,"Red");
        Set set=hash_map.entrySet();
        System.out.println(set);
    }
}
