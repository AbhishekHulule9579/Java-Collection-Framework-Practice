package HashMap;

import java.util.HashMap;

public class H5_Check_if_Empty {
    public static void main(String[] args) {
        HashMap<Integer,String> map1=new HashMap<Integer, String>();
        map1.put(1,"Black");
        map1.put(2,"Blue");
        map1.put(3,"Yellow");
        map1.put(4,"Red");
        map1.put(5,"Violet");
        boolean result=map1.isEmpty();
        System.out.println("All values are: "+result);

        map1.clear();

        result= map1.isEmpty();
        System.out.println("All values are: "+result);

    }
}
