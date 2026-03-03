package DSA.TCS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MissingNumber {
    public static int findmissing(List<Integer>list,int n){
        long expectedsum=(long) n*(n+1)/2;
        long actualSum=0;
        for(int num:list){
            actualSum+=num;
        }
        return (int)(expectedsum-actualSum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println(findmissing(list,n));
    }
}
/*
Q - Missing Number in an Array
Problem Statement:
You are given an array containing n distinct numbers taken from the range 0 to n.
Since there are n + 1 numbers in the range and only n numbers in the array, exactly one number is missing.
Your task is to find and print the missing number.
Input Format:
The first line contains an integer n, the size of the array.
The second line contains n space-separated distinct integers in the range 0 to n.
Output Format:
Print the missing number.
Constraints:
1 <= n <= 10 ^ 5
0 <= arr[i] <= n
All elements are distinct
Sample Input 1:
3
301
Sample Output 1:
2
Explanation Range is 0 to 3 → {0,1,2,3} 2 is missing.
 */