package DSA.TCS.Latest;

import java.util.*;
public class WareHouse_Pair {
    public static int findPairs(int[] arr){
        int n=arr.length;
        if(n%2!=0){
            return -1;
        }
        Arrays.sort(arr);
        int target=arr[0]+arr[n-1];
        int pairs=0;
        int left=0;
        int right=n-1;
        while(left<right){
            if(arr[left]+arr[right]!=target)
                return -1;
            pairs ++;
            left++;
            right--;

        }
        return pairs;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findPairs(arr));
    }
}
/*
Problem 3: The Warehouse Box Arrangement
A warehouse receives N boxes, each having a weight.
Manager wants to form pairs such that:
Each pair must have equal total weight.
Each box can be used only once.
If impossible -> print -1.
Otherwise print:
Number of pairs formed.
Input:
N w1 w2 w3... WN
Constraints:
1 <= N <= 10 ^ 5
1 <= wi <= 10 ^ 4
input
4
1
3
2
2
output
2
** 1+3=4
** 2+2=4
 */