package DSA.IBM;

import java.util.Scanner;

public class I5_Alternate_Parity {
    public static int findParity(int[] arr){
        int operation=0;

        for(int i=0;i<arr.length-1;i++){
            while((arr[i]%2)==(arr[i+1]%2)){
                arr[i+1]=arr[i+1]/2;
                operation++;
            }
        }
        return operation;
    }
    public static void main(String[] args) {
        int[] arr={8,4,2,1,6,5};
        int result=findParity(arr);
        System.out.println("The minimum operation needed is of "+result);
    }
}
/*
Given an array. Make sure every pair of adjacent elements has different parity (one even, one odd).
You can repeatedly divide any element by 2 (floor division).
Find the minimum number of such operations needed.
 */