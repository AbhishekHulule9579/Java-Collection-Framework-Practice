package DSA.IBM;

import java.util.Scanner;

public class I1_HCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();

        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("HCF is "+ a);
    }
}
/*
 Write a program to find HCF of two numbers by without using recursion.
 */