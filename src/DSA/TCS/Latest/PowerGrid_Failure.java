package DSA.TCS.Latest;

import java.util.Scanner;

public class PowerGrid_Failure {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n-2;i++){
            if(arr[i]<arr[i+1] && arr[i+1]<arr[i+2]){
                count++;
            }
        }
        System.out.println(count);
    }
}
/*
Problem 4: The Power Grid Failure
A town has N houses in a row.
Each house has a power consumption value.
If three consecutive houses have strictly increasing consumption, the grid overloads.
Your task:
Count how many times overload happens.
Input:
N
al a2 a3.........aN
Input
6
2 5 7 4 6 8

Check triples:

Houses	Values	Condition
(1,2,3)	2,5,7	increasing → overload
(2,3,4)	5,7,4	not increasing
(3,4,5)	7,4,6	not increasing
(4,5,6)	4,6,8	increasing → overload

Total overloads

2
 */