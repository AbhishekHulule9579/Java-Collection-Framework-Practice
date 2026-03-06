package DSA.TCS;

import java.util.Scanner;

public class Abundant_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n %i==0)
                sum +=i;
        }
        if(sum>n){
            System.out.println("abundant Number");
        }
        else{
            System.out.println("not Abundant Number");
        }
    }
}
/*
If the sum of divisors of a number is greater than the number then it is called abundant number.
 */