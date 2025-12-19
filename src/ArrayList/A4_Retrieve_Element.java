package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A4_Retrieve_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> stringList=new ArrayList<String>();
        System.out.println("Enter the list number");
        int n=sc.nextInt();
        System.out.println("Enter the list element");
        for(int i=0;i<n;i++){
            stringList.add(sc.next());
        }
        for(String ls:stringList){
            System.out.println(ls);
        }
        System.out.println("**************************************");
        String element=stringList.get(0);
        System.out.println(element);
        System.out.println("***************************************");
        System.out.println(stringList.get(3));

    }

}
