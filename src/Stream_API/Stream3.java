package Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream3 {
    public static void main(String[] args) {
        ArrayList<Integer>marks=new ArrayList<Integer>();
        marks.add(25);
        marks.add(35);
        marks.add(40);
        marks.add(30);
        marks.add(45);

        System.out.println(marks);
        List<Integer> sortedOrder=marks.stream().sorted((i1,i2)->(i1<i1)?1:(i1>i2)?-1:0).collect(Collectors.toList());
        System.out.println(sortedOrder);
    }
}
