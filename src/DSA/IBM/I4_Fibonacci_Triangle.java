package DSA.IBM;

import java.util.Scanner;

public class I4_Fibonacci_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit/rows ");
        int n=sc.nextInt();
        int a=0,b=1,c;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(a+" ");
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println();
        }
    }
}
