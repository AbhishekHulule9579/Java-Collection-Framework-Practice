package DSA.TCS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leaders_in_Array {

    public static List<Integer> findLeader(int[] arr) {
        List<Integer> leaders = new ArrayList<>();

        int n = arr.length;
        int maxSoFar = arr[n - 1];

        leaders.add(maxSoFar);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxSoFar) {
                maxSoFar = arr[i];
                leaders.add(maxSoFar);
            }
        }

        return leaders;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> result = findLeader(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
/*
Q- Leaders in an Array
Problem Statement:
Given an array of integers, print all the leaders in the array.
An element is said to be a leader if it is greater than or equal to all the elements to its right.
The rightmost element is always a leader.
Input Format:
The first line contains an integer N, the size of the array.
The second line contains N space-separated integers.
Output Format:
Print all the leaders in the array in the order they appear.
Constraints:
1 <= N <= 10 ^ 5
- 10 ^ 9 <= arr[i] <= 10 ^ 9
Sample Input 1:
6
16 17 4 3 5 2
Sample Output 1:
17 5 2
Explanation
From right to left:
2 → leader
5→ greater than 2 leader
3→ not greater than 5
4→ not greater than 5
17 → greater than 5 leader
not greater than 17 16
Leaders 17 5 2
 */