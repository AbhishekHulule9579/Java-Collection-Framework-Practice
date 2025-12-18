package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Insert_First_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String>stringList=new ArrayList<String>();
        System.out.println("Enter total length of the list");
        int n=sc.nextInt();
        System.out.println("Enter the string element :");
        for(int i=0;i<n;i++){
            stringList.add(sc.next());
        }
        for(String lists:stringList){
            System.out.println(lists);
        }
        System.out.println("Enter the string which we have to add at first position: ");
        stringList.add(0,sc.next());

        for(String lists:stringList){
            System.out.println(lists);
        }
    }
}
