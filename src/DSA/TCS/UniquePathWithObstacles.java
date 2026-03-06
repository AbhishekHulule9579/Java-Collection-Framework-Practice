package DSA.TCS;

public class UniquePathWithObstacles {
    public static int uniquePaths(int[][] grid){
        int m= grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        if(grid[0][0]==1)
            return 0;
        dp[0][0]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    dp[i][j]=0;
                }
                else{
                    if(i>0)
                        dp[i][j] +=dp[i-1][j];
                    if(j>0)
                        dp[i][j] +=dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
    public static void main(String[] args) {
        int[][] grid={
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };
        System.out.println(uniquePaths(grid));
    }
}
/*
Problem Statement:
Given a grid of size m*n, let us assume you are starting at (1, 1) and your goal is to reach (m, n).
At any instance, if you are on (x, y), you can either go to (x, y + 1) or (x + 1, y).
Now consider if some obstacles are added to the grids.
How many unique paths would there be? An obstacle and space are marked as 1 and 0 respectively in the grid.
sample test case n=3,m= 3
arr = [
[0 0 0],
[0 1 0],
[0 0 0]
]
output: 2

 */