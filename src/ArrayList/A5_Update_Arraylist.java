package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A5_Update_Arraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String>stringList=new ArrayList<String>();
        stringList.add("Red");
        stringList.add("Green");
        stringList.add("Orange");
        stringList.add("White");
        stringList.add("Black");
        for(String str:stringList){
            System.out.println(str);
        }
        System.out.println("Enter the string to insert at 1");
        String str1= sc.next();
        stringList.set(1,str1);
        for(String str:stringList){
            System.out.println(str);
        }
    }
}
