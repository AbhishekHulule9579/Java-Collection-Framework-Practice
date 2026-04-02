package DSA.TCS_Interview;

import java.lang.reflect.Array;
import java.util.*;

public class T9_Remove_Duplicate {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,4,2,5,6,9,7,8};
        Set<Integer>set=new LinkedHashSet<>();
        for(int num:arr){
            set.add(num);
        }
        System.out.println(set);
    }
}
