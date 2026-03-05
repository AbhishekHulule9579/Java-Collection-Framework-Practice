package DSA.TCS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Merge_Overlaping_Interval {
    public static List<int[]> merge(List<int[]> interval){
        interval.sort((a,b)->a[0]-b[0]);
        List<int[]>result=new ArrayList<>();
        int[] current= interval.get(0);
        for(int i=1;i<interval.size();i++){
            int[] next=interval.get(i);
            if(current[1]>=next[0]){
                current[1]=Math.max(current[1],next[1]);
            }
            else{
                result.add(current);
                current=next;
            }
        }
        result.add(current);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<int[]> intervals=new ArrayList<>();
        for(int i=0;i<n;i++){
            int start=sc.nextInt();
            int end=sc.nextInt();
            intervals.add(new int[]{start,end});
        }
        List<int []>merged=merge(intervals);
        for(int[] i:merged){
            System.out.println(i[0]+" "+i[1]);
        }
    }
}

/*
Q-Merge Overlapping Intervals
Problem Statement:
You are given an array of intervals where: intervals[i]=[starti,endi]
Your task is to merge all overlapping intervals and return a list of non-overlapping intervals that cover all the intervals in the input.
Input Format:
The first line contains an integer N, representing the number of intervals.
The next N lines contain two space-separated integers start end, representing each interval.
Output Format:
Print the merged intervals, one per line.
Each line should contain two space-separated integers representing the merged interval.
Constraints:
1 <= N <= 10 ^ 5
-10º ≤ start, end ≤ 10º
start < end
Q-Merge Overlapping Intervals
Sample Input 1:
4
1 3
2 6
8 10
15 18
Sample Output 1:
1 6
8 10
15 18
Explanation
[1,3] and [2,6] overlap merged into [1,6] Others do not overlap
 */