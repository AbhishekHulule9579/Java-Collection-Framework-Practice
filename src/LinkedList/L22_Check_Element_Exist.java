package LinkedList;

import java.util.LinkedList;

public class L22_Check_Element_Exist {
    public static void main(String[] args) {
        LinkedList<String> c1=new LinkedList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("The original linked list "+c1);
        if(c1.contains("Green")){
            System.out.println("The Green color is present ");
        }
        else{
            System.out.println("The green element is not present");
        }

        if(c1.contains("Blue")){
            System.out.println("The Blue color is present");
        }
        else{
            System.out.println("THe blue color is not present");
        }
    }
}
