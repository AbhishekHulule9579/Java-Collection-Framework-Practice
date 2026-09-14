package Stream_API;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream4 {
    public static void main(String[] args) {
        ArrayList<String>l=new ArrayList<String>();
        l.add("Abhishek");
        l.add("Mayank");
        l.add("Omkar");
        l.add("Rushikesh");
        l.add("Tejas");
        l.add("Poonam");

        System.out.println(l);
        List<String> sort=l.stream().sorted().collect(Collectors.toList());
        System.out.println(sort);

        System.out.println("-----------------------------------------------------------------------");

        List<String>reversesorted=l.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
        System.out.println(reversesorted);

        /*
        (s1,s2)->s1.compareTo(s2)  --> natural sorting order
        (s1,s2)->s2.compareTo(s1)  --> reverse of natural sorting order
         */
        System.out.println("**************************************************************");

        Comparator<String> compare=(s1,s2)->{
            int l1=s1.length();
            int l2=s2.length();
            if(l1<l2) return -1;
            else if(l1>l2) return +1;
            else return s1.compareTo(s2);
        };
        List<String>compared =l.stream().sorted(compare).collect(Collectors.toList());
        System.out.println(compared);

    }
}
