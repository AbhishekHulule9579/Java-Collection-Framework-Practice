package DSA.TCS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Airport_Security {
    public static void sortRisk(List<Integer>list){
        int count0=0,count1=0,count2=0;
        for(int num:list){
            if(num==0)
                count0++;
            else if (num==1)
                count1++;
            else count2++;
        }
        int index=0;
        while(count0-->0)
            list.set(index++,0);
        while(count1-->0)
            list.set(index++,1);
        while(count2-->0)
            list.set(index++,2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        sortRisk(list);
        for(int num:list){
            System.out.println(num+" ");
        }
    }
}
