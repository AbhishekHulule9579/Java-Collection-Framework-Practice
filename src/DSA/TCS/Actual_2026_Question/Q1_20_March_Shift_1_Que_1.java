package DSA.TCS.Actual_2026_Question;

import java.util.Scanner;

public class Q1_20_March_Shift_1_Que_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the month ");
        int n= sc.nextInt();
        if(n==1){
            System.out.println("2000");
        } else if (n==3) {
            System.out.println("5000");
        } else if (n==6) {
            System.out.println("9000");
        } else if (n==9) {
            System.out.println("12000");
        } else if (n==12) {
            System.out.println("15000");
        }else {
            System.out.println("Error!");
        }
    }
}
/*
Gym Membership Cost
Description: A simple problem requiring calculation
of total gym fees based on specific plan durations (e.g., 1, 3, 6, 9, 12 months)
 and inputting the number of months.
Logic: The input months (1,3,6,9,12) often had to match specific plan values to calculate costs (1m=2000,3m=5000),
 with some users needing to output "Error" if no plan matched.



 1. Calculate GYM fee
1 month 2k
3 months 5k
6 months 9k
9 months 12k
12 months 15k
Other than this Error
1
 */