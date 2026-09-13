package Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {
        ArrayList<Integer>l=new ArrayList<Integer>();
        l.add(0);
        l.add(10);
        l.add(20);
        l.add(9);
        l.add(40);
        l.add(43);
        l.add(50);

        System.out.println(l);
        List<Integer>l1=l.stream().map(i->i+1).collect(Collectors.toList());
        System.out.println(l1);
    }
}
