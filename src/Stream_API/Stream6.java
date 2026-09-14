package Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream6 {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<Integer>();
        l.add(2);
        l.add(3);
        l.add(0);
        l.add(7);
        l.add(90);
        l.add(85);
        l.add(80);
        System.out.println(l);
        Integer[] i=l.stream().toArray(Integer[]::new);
        for(Integer i1:i){
            System.out.println(i1);
        }
        Stream.of(i).forEach(System.out::println);
    }
}
