package DSA.TCS.Latest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Odd_Ballons {
    public static char findOdd(char[] arr){
        Map<Character,Integer>map=new HashMap<>();
        for(char c:arr){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:arr){
            if(map.get(c)%2 !=0){
                return c;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        char[] arr=new char[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next().charAt(0);
        }

        char result=findOdd(arr);
        if(result==' '){
            System.out.println("All are even");
        }
        else
            System.out.println(result);
    }
}
