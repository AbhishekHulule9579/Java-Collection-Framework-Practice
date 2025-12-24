package ArrayList.DSA;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class A1_Remove_Duplicate {
    public static void main(String[] args) {
        List<Integer>num=new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(1);
        num.add(2);
        System.out.println("Original Arraylist "+num);
        Set<Integer>num2=new LinkedHashSet<Integer>(num);
        num.clear();
        num.addAll(num2);
        System.out.println("List of integer element without repetition "+num);
    }
}
