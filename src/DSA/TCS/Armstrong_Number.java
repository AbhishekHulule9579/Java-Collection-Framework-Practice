package DSA.TCS;

import java.util.Scanner;

public class Armstrong_Number {
    static boolean isArmstrong(int n){
        int original=n;
        int digit=0;
        int temp=n;

        while(temp>0){
            digit++;
            temp/=10;
        }
        int sum=0;
        temp=n;

        while(temp>0){
            int digits=temp%10;
            sum+=Math.pow(digits,digit);
            temp/=10;
        }
        return sum==original;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isArmstrong(n))
            System.out.println("The number is Armstrong");
        else
            System.out.println("The number is NOT armstrong");
    }
}
/*
Armstrong Numbers are the numbers having the sum of digits raised to power no. of digits
 * is equal to a given number. Examples- 0, 1, 153, 370, 371, 407, and 1634 are some of the
 * Armstrong Numbers.
 */