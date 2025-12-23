package ArrayList;

import java.util.ArrayList;

public class A21_Replace_Second_Element {
    public static void main(String[] args) {
        ArrayList<String>color=new ArrayList<String>();
        color.add("Black");
        color.add("Red");
        System.out.println("THe original arraylist is: "+color);
        String new_color="White";
        color.set(1,new_color);

        int num=color.size();
        System.out.println("Replaced second element with "+new_color);
        for (int i=0;i<num;i++){
            System.out.println(color.get(i));
        }
    }
}
