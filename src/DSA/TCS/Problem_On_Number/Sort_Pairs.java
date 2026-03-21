package DSA.TCS.Problem_On_Number;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_Pairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][] mat=new int[n][2];
        for(int i=0;i<n;i++){
            mat[i][0]=sc.nextInt();
            mat[i][1]=sc.nextInt();
        }
        Arrays.sort(mat,(a,b)->{
            if(a[0]==b[0]){
                return a[1]-b[1];
            }
            return a[0]-b[0];
        });

        for(int i=0;i<n;i++){
            System.out.println(mat[i][0]+" "+mat[i][1]);
            if(i !=n-1)
                System.out.println(", ");
        }
    }
}
/*
You are given n pairs. Sort them:
1. By first element (ascending)
2. If first elements are equal sort by second element (ascending)
Input:
3
3 6,2 4, 7 8
Output:
2 4,3 6, 7 8
 */