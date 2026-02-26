package DSA.TCS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MakeTripletEquals {
    public static int minStepsToEquals(List<Integer>list){
        Collections.sort(list);
        if(list.get(0).equals(list.get(1)) && list.get(1).equals(list.get(2))){
            return 0;
        }
        int step=0;
        while(true){
            list.set(0,list.get(0)+1);
            list.set(1,list.get(1)+1);
            list.set(2,list.get(2)-1);

            step++;
            Collections.sort(list);
            if(list.get(0).equals(list.get(1))
            && list.get(1).equals(list.get(2))){
                return step;
            }
            if(list.get(0).equals(list.get(1))
            && list.get(1)+1 ==list.get(2)
            || list.get(1).equals(list.get(2))
            && list.get(0)+1 ==list.get(1)){
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(Arrays.asList(2,4,6));
        System.out.println(minStepsToEquals(list));
    }
}
