package DSA.TCS.Problem_On_Number;

import java.util.Scanner;

public class Two_Series_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=16;
        int result=0;
        if(n%2!=0){
            int power=(n-1)/2;
             result=(int)Math.pow(2,power-1);
        }
        else{
            int power=(n/2)-1;
            result=(int)Math.pow(3,power);
        }
        System.out.println(result);
    }
}
/*
Consider the following series: 1,1,2,3,4,9,8,27,16,81,32,243,64,729,128,2187...
This series is a mixture of 2 series - all the odd terms in this series form a
geometric series and all the even terms form yet another geometric series.
Write a program to find the Nth term in the series.
The value N is a positive integer that should be read from STDIN. The Nth term that
is calculated by the program should be written to STDOUT. Other than the value of the nth term,
no other character/string or message should be written to STDOUT. For example,
if N = 16 the 16th term in the series is 2187, so only value 2187 should be printed to STDOUT.
You can assume that N will not exceed 30.

 */