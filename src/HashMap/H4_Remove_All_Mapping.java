package HashMap;

import java.util.HashMap;

public class H4_Remove_All_Mapping {
    public static void main(String[] args) {
        HashMap<Integer,String> map1=new HashMap<Integer, String>();
        map1.put(1,"Black");
        map1.put(2,"Blue");
        map1.put(3,"Yellow");
        map1.put(4,"Red");
        map1.put(5,"Violet");

        System.out.println("All values are: "+map1);

        map1.clear();

        System.out.println("Values are: "+map1);
    }
}
