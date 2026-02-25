package DSA.TCS;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Deque;

public class Maximum_Window_Integer {
    public static int[] findMaximum(int[] arr,int k){
        int n= arr.length;
        if(n==0 || k<=0)
            return new int[0];
        int[] result=new int[n-k+1];
        for(int i=0;i<=n-k;i++){
            int max=arr[i];
            for(int j=1;j<k;j++){
                max=Math.max(max,arr[i+j]);
            }
            result[i]=max;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr={1, 3, -1, -3, 5, 3, 6, 7};
        int k=3;
        int[] result=findMaximum(arr,k);
        System.out.println(Arrays.toString(result));
    }
}


/*
Problem Statement: You are given an array of integers arr and an integer k Your task is to find and print the maximum number in each contiguous window of size k.
Input:
arr = [1, 3, -1, -3, 5, 3, 6, 7]
k = 3
Output:
[3, 3, 5, 5, 6,7]
SHARE
* */