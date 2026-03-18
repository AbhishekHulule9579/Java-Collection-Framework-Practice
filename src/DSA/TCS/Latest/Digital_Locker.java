package DSA.TCS.Latest;

import java.util.*;
public class Digital_Locker {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int pin=sc.nextInt();

        int sum=0;
        int evenCount=0;
        boolean[] seen=new boolean[10];
        while(pin>0){
            int digit=pin % 10;
            if(seen[digit]){
                System.out.println("Locked");
                return;
            }
            seen[digit]=true;
            if(digit %2==0){
                evenCount++;
            }
            sum +=digit;
            pin /=10;
        }
        if(evenCount==2 && sum %3==0){
            System.out.println("OPEN");
        }
        else{
            System.out.println("Locked");
        }
    }
}