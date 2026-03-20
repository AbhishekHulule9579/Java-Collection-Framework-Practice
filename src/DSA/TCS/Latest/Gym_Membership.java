package DSA.TCS.Latest;

import java.util.Scanner;

public class Gym_Membership {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0)
            System.out.println("Invalid Input");
        else if(n==1){
            System.out.println("2000");
        } else if (n>=2 && n<=3) {
            System.out.println("5000");
        } else if (n>=4 && n<=6) {
            System.out.println("9000");
        } else {
            System.out.println("15000");
        }
    }
}
/*
Gym Membership Cost
Problem Statement
A gym offers membership plans based on the
number of months a customer wants to enroll.
The cost of the membership is determined as
follows:
Duration (Months)Cost (₹)
≤ 0 Invalid Input
1 2000
2 to 3 5000
4 to 6 9000
> 6 15000
Task
Write a program that:
• Takes an integer input months
• Prints:
o "Invalid Input" if months <= 0
o Otherwise prints:
Cost: <amount>
Input Format
• A single integer months
Output Format
• Print "Invalid Input" OR
• Print "Cost: <amount>"
Sample Test Cases
Test Case 1
Input:
1
Output:
Cost: 2000
Test Case 2
Input:
3
Output:
Cost: 5000
Test Case 3
Input:
5
Output:
Cost: 9000
Test Case 4
Input:
7
Output:
Cost: 15000
Test Case 5
Input:
0
Output:
Invalid Input
 */