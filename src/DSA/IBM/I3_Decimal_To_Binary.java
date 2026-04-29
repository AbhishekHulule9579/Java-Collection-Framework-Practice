package DSA.IBM;

import java.util.Scanner;

public class I3_Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String binary="";
        while(n>0){
            binary=(n%2)+binary;
            n=n/2;
        }
        System.out.println("Binary is "+binary);
    }
}
