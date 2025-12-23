package ArrayList;

import java.util.ArrayList;

public class A22_PrintBy_Position {
    public static void main(String[] args) {
        ArrayList<String>c1=new ArrayList<String>();
        c1.add("Pink");
        c1.add("Black");
        c1.add("Blue");
        c1.add("Yellow");
        c1.add("Red");
        c1.add("Purple");
        System.out.println("\nOriginal Arraylist: "+c1);
        System.out.println("\nPrint Arraylist using indexes");
        int n=c1.size();
        for(int i=0;i<n;i++){
            System.out.println(c1.get(i));
        }
    }
}
