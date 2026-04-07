package DSA.TCS_Interview;

import java.util.Scanner;

public class T26_Fibonnaci_With_Exception {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter the number ");
            int n=sc.nextInt();
            if(n<0) {
                throw new IllegalAccessException("Number must be not negative");
            }
            System.out.println("Fibonacci series");
            int a=0,b=1;
            for(int i=1;i<=n;i++){
                System.out.print(a+" ");

                int next=a+b;
                a=b;
                b=next;
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
        finally {
            System.out.println("Program executed ");
        }
    }
}
