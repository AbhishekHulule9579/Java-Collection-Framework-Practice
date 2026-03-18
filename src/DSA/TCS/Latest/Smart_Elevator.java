package DSA.TCS.Latest;

import java.util.Scanner;

public class Smart_Elevator {
    public static int calculatetime(int[] arr){
        int currentfloor=0;
        int totaltime=0;
        for(int i=0;i<arr.length;i++){
            int floor=arr[i];
            if(floor==currentfloor){
                totaltime +=1;
            }
            else{
                int distance=Math.abs(floor-currentfloor);
                totaltime +=distance *2+1;
            }
            currentfloor=floor;
        }
        return totaltime;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(calculatetime(arr));
    }
}
/*
Problem 1: The Smart Elevator
A company has installed a smart elevator in a 10-floor building (floors numbered 0 to 9).
The elevator starts at floor 0.
You are given a sequence of floor requests.
Rules:
If the requested floor is higher than current floor -> elevator moves up.
If lower -> elevator moves down.
Moving 1 floor takes 2 seconds.
Stopping at a floor takes 1 second.
If the request is the same as current floor -> only 1 second (stop time).
Your task:
Calculate the total time taken to serve all requests in order.
Input:
f1 f2 f3 ... fn
Constraints:
1 <= n <= 100 0 <= fi <= 9

 */