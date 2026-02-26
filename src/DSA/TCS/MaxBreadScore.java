package DSA.TCS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxBreadScore {
    public static double maxscore(List<Integer>list,int k){
        int n=list.size();
        double[][]dp=new double[k+1][n+1];
        for(int group=1;group<=k;group++){

            for(int i=group;i<=n;i++){

                double currentsum=0;
                for(int j=i;j>=group;j--){
                    currentsum +=list.get(j-1);
                    double average=currentsum/(i-j+1);
                    dp[group][i]=Math.max(dp[group][i],dp[group-1][j-1]+average);
                }
            }
        }
        return dp[k][n];
    }
    public static void main(String[] args) {
        List<Integer>list1= Arrays.asList(9, 1, 2, 3, 9);
        int k1=3;
        System.out.println((int)Math.ceil(maxscore(list1,k1)));

        List<Integer>list2= Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        int k2=4;
        System.out.println((int)Math.ceil(maxscore(list2,k2)));
    }
}
/*
Divide the array into exactly k non-empty contiguous groups (subarrays)
👉 For each group, calculate its average
👉 Return the maximum possible sum of averages of these k groups

At the end, you return:

ceil(maximum sum of averages)
nums = [9, 1, 2, 3, 9]
k = 3
One optimal partition is:

[9] | [1,2,3] | [9]
Averages:

9
(1+2+3)/3 = 2
9
Total = 9 + 2 + 9 = 20 ✅

So output = 20
 */