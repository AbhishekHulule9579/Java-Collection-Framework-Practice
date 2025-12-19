package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A2_Iterate_Arraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String > list_string=new ArrayList<>();
        System.out.println("Enter number of the member");
        int n=sc.nextInt();
        System.out.println("Enter the names of the member");
        for(int i=0;i<n;i++){
            list_string.add(sc.next());
        }
        for(String item:list_string){
            System.out.println(item);
        }
    }
}
