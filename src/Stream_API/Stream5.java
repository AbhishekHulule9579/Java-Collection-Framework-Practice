package Stream_API;

import java.util.ArrayList;
import java.util.List;

public class Stream5 {
    public static void main(String[] args) {
        List<Integer>l=new ArrayList<Integer>();
        l.add(2);
        l.add(3);
        l.add(0);
        l.add(7);
        l.add(90);
        l.add(85);
        l.add(80);

        System.out.println(l);
        int min=l.stream().min((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(min);

        int max=l.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(max);
    }
}
